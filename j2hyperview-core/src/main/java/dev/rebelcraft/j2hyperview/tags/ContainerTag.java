package dev.rebelcraft.j2hyperview.tags;

import dev.rebelcraft.j2hyperview.HyperviewConfig;
import dev.rebelcraft.j2hyperview.attributes.Attribute;
import dev.rebelcraft.j2hyperview.rendering.FlatHxml;
import dev.rebelcraft.j2hyperview.rendering.HxmlBuilder;
import dev.rebelcraft.j2hyperview.rendering.IndentedHxml;
import dev.rebelcraft.j2hyperview.rendering.TagBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ContainerTag<T extends ContainerTag<T>> extends Tag<T> {

	protected List<HyperviewContent> children;

	public ContainerTag(String tagName) {
		super(tagName);
		this.children = new ArrayList<>();
	}

	public T with(HyperviewContent child) {
		if (this == child) {
			throw new RuntimeException("Cannot append a tag to itself.");
		}
		if (child != null) {
			// in some cases, like when using iff(), we ignore null children
			children.add(child);
		}
		return self();
	}

	public T with(Iterable<? extends HyperviewContent> children) {
		if (children != null) {
			for (HyperviewContent child : children) {
				this.with(child);
			}
		}
		return self();
	}

	public T with( HyperviewContent... children) {
		for (HyperviewContent child : children) {
			with(child);
		}
		return self();
	}

	public T with(Stream<HyperviewContent> children) {
		children.forEach(this::with);
		return self();
	}

	/**
	 * Appends a Text-object to this element
	 *
	 * @param text the text to be appended
	 * @return itself for easy chaining
	 */
	public T withText(String text) {
		return with(new Text(text));
	}

	/**
	 * Gets number of child nodes this tag element contains
	 */
	public int getNumChildren() {
		return children.size();
	}

	/**
	 * Render the ContainerTag and its children, adding newlines before each
	 * child and using Config.indenter to indent child based on how deep
	 * in the tree it is
	 *
	 * @return the rendered and formatted string
	 */
	public String renderFormatted() {
		try {
			return render(IndentedHxml.into(new StringBuilder(), HyperviewConfig.global())).toString();
		}catch (IOException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	@Override
	public <A extends Appendable> A render(HxmlBuilder<A> builder, Object model) throws IOException {
		if (hasTagName()) {
			TagBuilder tagBuilder = builder.appendStartTag(getTagName());
			for(Attribute attribute : getAttributes()){
				attribute.render(tagBuilder, model);
			}
			tagBuilder.completeTag();
		}

		for(HyperviewContent child : children){
			child.render(builder, model);
		}

		if(hasTagName()) {
			builder.appendEndTag(getTagName());
		}

		return builder.output();
	}

	@Override
	@Deprecated
	public void renderModel(Appendable writer, Object model) throws IOException {
		HxmlBuilder<?> builder = (writer instanceof HxmlBuilder)
				? (HxmlBuilder<?>) writer
				: FlatHxml.into(writer, HyperviewConfig.global());

		render(builder, model);
	}

}
