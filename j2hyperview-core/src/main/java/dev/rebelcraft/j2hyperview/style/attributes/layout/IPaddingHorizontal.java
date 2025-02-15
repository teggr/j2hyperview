package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IPaddingHorizontal<T extends Tag<T>> extends IInstance<T> {

	default T withPaddingHorizontal(final String paddingHorizontal_) {
		return self().attr("paddingHorizontal", paddingHorizontal_);
	}

	default T withCondPaddingHorizontal(final boolean enable, final String paddingHorizontal_) {
		if (enable) {
			self().attr("paddingHorizontal", paddingHorizontal_);
		}
		return self();
	}

}
