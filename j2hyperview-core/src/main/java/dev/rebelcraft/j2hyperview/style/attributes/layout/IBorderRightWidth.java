package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IBorderRightWidth<T extends Tag<T>> extends IInstance<T> {

	default T withBorderRightWidth(final String borderRightWidth_) {
		return self().attr("borderRightWidth", borderRightWidth_);
	}

	default T withCondBorderRightWidth(final boolean enable, final String borderRightWidth_) {
		if (enable) {
			self().attr("borderRightWidth", borderRightWidth_);
		}
		return self();
	}

}
