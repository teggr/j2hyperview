package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IJustifyContent<T extends Tag<T>> extends IInstance<T> {

	default T withJustifyContent(final String justifyContent_) {
		return self().attr("justifyContent", justifyContent_);
	}

	default T withCondJustifyContent(final boolean enable, final String justifyContent_) {
		if (enable) {
			self().attr("justifyContent", justifyContent_);
		}
		return self();
	}

}
