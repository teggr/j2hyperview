package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IPaddingVertical<T extends Tag<T>> extends IInstance<T> {

	default T withPaddingVertical(final String paddingVertical_) {
		return self().attr("paddingVertical", paddingVertical_);
	}

	default T withCondPaddingVertical(final boolean enable, final String paddingVertical_) {
		if (enable) {
			self().attr("paddingVertical", paddingVertical_);
		}
		return self();
	}

}
