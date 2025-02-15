package dev.rebelcraft.j2hyperview.style.attributes.view;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IBorderRadius<T extends Tag<T>> extends IInstance<T> {

	default T withBorderRadius(final String borderRadius_) {
		return self().attr("borderRadius", borderRadius_);
	}

	default T withCondBorderRadius(final boolean enable, final String borderRadius_) {
		if (enable) {
			self().attr("borderRadius", borderRadius_);
		}
		return self();
	}

}
