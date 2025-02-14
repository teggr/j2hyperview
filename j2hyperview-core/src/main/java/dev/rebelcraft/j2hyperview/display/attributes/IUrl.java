package dev.rebelcraft.j2hyperview.display.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IUrl<T extends Tag<T>> extends IInstance<T> {

	default T withUrl(final String url_) {
		return self().attr("url", url_);
	}

	default T withCondUrl(final boolean enable, final String url_) {
		if (enable) {
			self().attr("url", url_);
		}
		return self();
	}

}