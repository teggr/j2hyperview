package dev.rebelcraft.j2hyperview.tags;

import dev.rebelcraft.j2hyperview.HyperviewConfig;
import dev.rebelcraft.j2hyperview.rendering.FlatHxml;
import dev.rebelcraft.j2hyperview.rendering.HxmlBuilder;

import java.io.IOException;

public class Text extends HyperviewContent {

	private final String text;

	public Text( final String text ) {
		this.text = text;
	}

	@Override
	public <T extends Appendable> T render(HxmlBuilder<T> builder, Object model) throws IOException {
		builder.appendEscapedText(String.valueOf(text));
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
