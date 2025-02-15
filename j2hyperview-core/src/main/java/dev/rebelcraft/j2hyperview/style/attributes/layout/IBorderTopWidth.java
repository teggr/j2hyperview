package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IBorderTopWidth<T extends Tag<T>> extends IInstance<T> {

	default T withBorderTopWidth(final String borderTopWidth_) {
		return self().attr("borderTopWidth", borderTopWidth_);
	}

	default T withCondBorderTopWidth(final boolean enable, final String borderTopWidth_) {
		if (enable) {
			self().attr("borderTopWidth", borderTopWidth_);
		}
		return self();
	}

}
