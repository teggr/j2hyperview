package dev.rebelcraft.j2hyperview.style.attributes.view;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IBorderBottomColor<T extends Tag<T>> extends IInstance<T> {

	default T withBorderBottomColor(final String borderBottomColor_) {
		return self().attr("borderBottomColor", borderBottomColor_);
	}

	default T withCondBorderBottomColor(final boolean enable, final String borderBottomColor_) {
		if (enable) {
			self().attr("borderBottomColor", borderBottomColor_);
		}
		return self();
	}

}
