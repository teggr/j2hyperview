package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IPaddingBottom<T extends Tag<T>> extends IInstance<T> {

	default T withPaddingBottom(final String paddingBottom_) {
		return self().attr("paddingBottom", paddingBottom_);
	}

	default T withCondPaddingBottom(final boolean enable, final String paddingBottom_) {
		if (enable) {
			self().attr("paddingBottom", paddingBottom_);
		}
		return self();
	}

}
