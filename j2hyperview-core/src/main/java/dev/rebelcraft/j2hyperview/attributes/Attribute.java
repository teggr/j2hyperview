package dev.rebelcraft.j2hyperview.attributes;

import dev.rebelcraft.j2hyperview.HyperviewConfig;
import dev.rebelcraft.j2hyperview.rendering.TagBuilder;
import dev.rebelcraft.j2hyperview.tags.Renderable;

import java.io.IOException;

public class Attribute implements Renderable {

	private final String name;
	private String value;

	public Attribute( final String name, final String value ) {
		this.name = name;
		this.value = value;
	}

	public Attribute( final String name ) {
		this.name = name;
		this.value = null;
	}

	@Override
	@Deprecated
	public void renderModel(Appendable writer, Object model) throws IOException {
		if (writer instanceof TagBuilder) {
			if (name != null) {
				if (value != null) {
					((TagBuilder) writer).appendAttribute(name, value);
				} else {
					((TagBuilder) writer).appendBooleanAttribute(name);
				}
			}
		} else {
			if (name == null) {
				return;
			}
			writer.append(' ');
			writer.append(name);
			if (value != null) {
				writer.append("=\"");
				writer.append(HyperviewConfig.textEscaper.escape(value));
				writer.append('"');
			}
		}
	}

	public void render(TagBuilder builder, Object model) throws IOException {
		// Maintain compatibility with classes that extend Attribute, for now...
		renderModel(builder, model);
	}

	public String getName() {
		return name;
	}

	public void setValue( final String value ) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
