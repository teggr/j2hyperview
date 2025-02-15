package dev.rebelcraft.j2hyperview.style.attributes.view;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IBorderBottomRightRadius<T extends Tag<T>> extends IInstance<T> {

	default T withBorderBottomRightRadius(final String borderBottomRightRadius_) {
		return self().attr("borderBottomRightRadius", borderBottomRightRadius_);
	}

	default T withCondBorderBottomRightRadius(final boolean enable, final String borderBottomRightRadius_) {
		if (enable) {
			self().attr("borderBottomRightRadius", borderBottomRightRadius_);
		}
		return self();
	}

}
