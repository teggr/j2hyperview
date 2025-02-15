package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface ICursorColor<T extends Tag<T>> extends IInstance<T> {

	default T withCursorColor(final String cursorColor_) {
		return self().attr("cursorColor", cursorColor_);
	}

	default T withCondCursorColor(final boolean enable, final String cursorColor_) {
		if (enable) {
			self().attr("cursorColor", cursorColor_);
		}
		return self();
	}

}