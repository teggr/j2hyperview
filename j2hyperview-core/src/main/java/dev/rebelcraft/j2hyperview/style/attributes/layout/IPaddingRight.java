package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IPaddingRight<T extends Tag<T>> extends IInstance<T> {

	default T withPaddingRight(final String paddingRight_) {
		return self().attr("paddingRight", paddingRight_);
	}

	default T withCondPaddingRight(final boolean enable, final String paddingRight_) {
		if (enable) {
			self().attr("paddingRight", paddingRight_);
		}
		return self();
	}

}
