package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IPaddingLeft<T extends Tag<T>> extends IInstance<T> {

	default T withPaddingLeft(final String paddingLeft_) {
		return self().attr("paddingLeft", paddingLeft_);
	}

	default T withCondPaddingLeft(final boolean enable, final String paddingLeft_) {
		if (enable) {
			self().attr("paddingLeft", paddingLeft_);
		}
		return self();
	}

}
