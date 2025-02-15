package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IPaddingTop<T extends Tag<T>> extends IInstance<T> {

	default T withPaddingTop(final String paddingTop_) {
		return self().attr("paddingTop", paddingTop_);
	}

	default T withCondPaddingTop(final boolean enable, final String paddingTop_) {
		if (enable) {
			self().attr("paddingTop", paddingTop_);
		}
		return self();
	}

}
