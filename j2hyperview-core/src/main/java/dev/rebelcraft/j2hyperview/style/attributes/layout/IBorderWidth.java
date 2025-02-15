package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IBorderWidth<T extends Tag<T>> extends IInstance<T> {

	default T withBorderWidth(final String borderWidth_) {
		return self().attr("borderWidth", borderWidth_);
	}

	default T withCondBorderWidth(final boolean enable, final String borderWidth_) {
		if (enable) {
			self().attr("borderWidth", borderWidth_);
		}
		return self();
	}

}
