package dev.rebelcraft.j2hyperview.tags;

import dev.rebelcraft.j2hyperview.HyperviewConfig;
import dev.rebelcraft.j2hyperview.rendering.FlatHxml;
import dev.rebelcraft.j2hyperview.rendering.HxmlBuilder;

import java.io.IOException;
import java.io.UncheckedIOException;

public interface Renderable {

	/**
	 * Render the Renderable and it's children using the supplied builder.
	 *
	 * @param builder A builder that can compose HTML elements.
	 * @param model   A model object to provide data for children to render.
	 * @param <T>     The type of the Appendable which HTML is being appended to.
	 * @return The Appendable to which HTML has been appended.
	 * @throws IOException
	 */
	default <T extends Appendable> T render(HxmlBuilder<T> builder, Object model) throws IOException {
		// This method should be overridden by any internal classes.
		// renderModel() is only being called to support backwards
		// compatibility.
		renderModel(builder, model);
		return builder.output();
	}

	/**
	 * Render the Renderable and it's children using the supplied builder.
	 *
	 * @param builder A builder that can compose HTML elements.
	 * @param <T>     The type of the Appendable to which HTML is being appended.
	 * @return The Appendable to which HTML has been appended.
	 * @throws IOException
	 */
	default <T extends Appendable> T render(HxmlBuilder<T> builder) throws IOException {
		return render(builder, null);
	}

	/**
	 * Create a StringBuilder and use it to render the Renderable and it's
	 * children
	 */
	default String render() {
		try {
			return render(FlatHxml.into(new StringBuilder(), HyperviewConfig.global())).toString();
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}
	}

	/**
	 * Render the Renderable and it's children using the supplied writer and a model.
	 *
	 * @param writer the current writer
	 * @param model  a model object to provide data for children to render
	 */
	@Deprecated
	default void renderModel(Appendable writer, Object model) throws IOException {
		// This method is a placeholder to support any client classes
		// which previously extended Renderable implementers, such as Tags.
		// No internal classes should implement this method; except to support
		// compatibility.  Instead they should implement rendering with an HtmlBuilder.
		throw new RuntimeException("Renderable.renderModel(Appendable writer, Object model) has been deprecated.  Please use Renderable.render(HtmlBuilder<T> builder, Object model) instead.");
	}

}
