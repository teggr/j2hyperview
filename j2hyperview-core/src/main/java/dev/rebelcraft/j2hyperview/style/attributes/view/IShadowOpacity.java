package dev.rebelcraft.j2hyperview.style.attributes.view;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IShadowOpacity<T extends Tag<T>> extends IInstance<T> {

	default T withShadowOpacity(final String shadowOpacity_) {
		return self().attr("shadowOpacity", shadowOpacity_);
	}

	default T withCondShadowOpacity(final boolean enable, final String shadowOpacity_) {
		if (enable) {
			self().attr("shadowOpacity", shadowOpacity_);
		}
		return self();
	}

}
