package dev.rebelcraft.j2hyperview.style.attributes.view;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IShadowRadius<T extends Tag<T>> extends IInstance<T> {

	default T withShadowRadius(final String shadowRadius_) {
		return self().attr("shadowRadius", shadowRadius_);
	}

	default T withCondShadowRadius(final boolean enable, final String shadowRadius_) {
		if (enable) {
			self().attr("shadowRadius", shadowRadius_);
		}
		return self();
	}

}
