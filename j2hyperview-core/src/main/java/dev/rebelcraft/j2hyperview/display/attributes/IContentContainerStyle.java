package dev.rebelcraft.j2hyperview.display.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IContentContainerStyle<T extends Tag<T>> extends IInstance<T> {

	default T withContentContainerStyle(final String contentContainerStyle_) {
		return self().attr("content-container-style", contentContainerStyle_);
	}

	default T withContentContainerStyle(final boolean enable, final String contentContainerStyle_) {
		if (enable) {
			self().attr("content-container-style", contentContainerStyle_);
		}
		return self();
	}

}