package dev.rebelcraft.j2hyperview.style.attributes.view;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IBorderBottomLeftRadius<T extends Tag<T>> extends IInstance<T> {

	default T withBorderBottomLeftRadius(final String borderBottomLeftRadius_) {
		return self().attr("borderBottomLeftRadius", borderBottomLeftRadius_);
	}

	default T withCondBorderBottomLeftRadius(final boolean enable, final String borderBottomLeftRadius_) {
		if (enable) {
			self().attr("borderBottomLeftRadius", borderBottomLeftRadius_);
		}
		return self();
	}

}
