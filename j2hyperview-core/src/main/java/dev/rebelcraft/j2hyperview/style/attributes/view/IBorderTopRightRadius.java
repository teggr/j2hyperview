package dev.rebelcraft.j2hyperview.style.attributes.view;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IBorderTopRightRadius<T extends Tag<T>> extends IInstance<T> {

	default T withBorderTopRightRadius(final String borderTopRightRadius_) {
		return self().attr("borderTopRightRadius", borderTopRightRadius_);
	}

	default T withCondBorderTopRightRadius(final boolean enable, final String borderTopRightRadius_) {
		if (enable) {
			self().attr("borderTopRightRadius", borderTopRightRadius_);
		}
		return self();
	}

}
