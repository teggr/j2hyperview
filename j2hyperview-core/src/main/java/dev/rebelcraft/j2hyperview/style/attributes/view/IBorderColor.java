package dev.rebelcraft.j2hyperview.style.attributes.view;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IBorderColor<T extends Tag<T>> extends IInstance<T> {

	default T withBorderColor(final String borderColor_) {
		return self().attr("borderColor", borderColor_);
	}

	default T withCondBorderColor(final boolean enable, final String borderColor_) {
		if (enable) {
			self().attr("borderColor", borderColor_);
		}
		return self();
	}

}
