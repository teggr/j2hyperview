package dev.rebelcraft.j2hyperview.display.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IHtml<T extends Tag<T>> extends IInstance<T> {

	default T withHtml(final String html_) {
		return self().attr("html", html_);
	}

	default T withCondHtml(final boolean enable, final String html_) {
		if (enable) {
			self().attr("html", html_);
		}
		return self();
	}

}