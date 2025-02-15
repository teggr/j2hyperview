package dev.rebelcraft.j2hyperview.style.attributes.view;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IBorderTopLeftRadius<T extends Tag<T>> extends IInstance<T> {

	default T withBorderTopLeftRadius(final String borderTopLeftRadius_) {
		return self().attr("borderTopLeftRadius", borderTopLeftRadius_);
	}

	default T withCondBorderTopLeftRadius(final boolean enable, final String borderTopLeftRadius_) {
		if (enable) {
			self().attr("borderTopLeftRadius", borderTopLeftRadius_);
		}
		return self();
	}

}
