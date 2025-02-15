package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IBorderLeftWidth<T extends Tag<T>> extends IInstance<T> {

	default T withBorderLeftWidth(final String borderLeftWidth_) {
		return self().attr("borderLeftWidth", borderLeftWidth_);
	}

	default T withCondBorderLeftWidth(final boolean enable, final String borderLeftWidth_) {
		if (enable) {
			self().attr("borderLeftWidth", borderLeftWidth_);
		}
		return self();
	}

}
