package dev.rebelcraft.j2hyperview.style.attributes.view;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IBorderRightColor<T extends Tag<T>> extends IInstance<T> {

	default T withBorderRightColor(final String borderRightColor_) {
		return self().attr("borderRightColor", borderRightColor_);
	}

	default T withCondBorderRightColor(final boolean enable, final String borderRightColor_) {
		if (enable) {
			self().attr("borderRightColor", borderRightColor_);
		}
		return self();
	}

}
