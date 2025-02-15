package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IOverflow<T extends Tag<T>> extends IInstance<T> {

	default T withOverflow(final String overflow_) {
		return self().attr("overflow", overflow_);
	}

	default T withCondOverflow(final boolean enable, final String overflow_) {
		if (enable) {
			self().attr("overflow", overflow_);
		}
		return self();
	}

}
