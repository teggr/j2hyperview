package dev.rebelcraft.j2hyperview.style.attributes.view;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IBorderLeftColor<T extends Tag<T>> extends IInstance<T> {

	default T withBorderLeftColor(final String borderLeftColor_) {
		return self().attr("borderLeftColor", borderLeftColor_);
	}

	default T withCondBorderLeftColor(final boolean enable, final String borderLeftColor_) {
		if (enable) {
			self().attr("borderLeftColor", borderLeftColor_);
		}
		return self();
	}

}
