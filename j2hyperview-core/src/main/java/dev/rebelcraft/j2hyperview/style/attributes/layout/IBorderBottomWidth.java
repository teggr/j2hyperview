package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IBorderBottomWidth<T extends Tag<T>> extends IInstance<T> {

	default T withBorderBottomWidth(final String borderBottomWidth_) {
		return self().attr("borderBottomWidth", borderBottomWidth_);
	}

	default T withCondBorderBottomWidth(final boolean enable, final String borderBottomWidth_) {
		if (enable) {
			self().attr("borderBottomWidth", borderBottomWidth_);
		}
		return self();
	}

}
