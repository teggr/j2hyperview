package dev.rebelcraft.j2hyperview.style.attributes.view;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IBorderTopColor<T extends Tag<T>> extends IInstance<T> {

	default T withBorderTopColor(final String borderTopColor_) {
		return self().attr("borderTopColor", borderTopColor_);
	}

	default T withCondBorderTopColor(final boolean enable, final String borderTopColor_) {
		if (enable) {
			self().attr("borderTopColor", borderTopColor_);
		}
		return self();
	}

}
