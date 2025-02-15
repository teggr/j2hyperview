package dev.rebelcraft.j2hyperview.style.attributes.view;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IShadowColor<T extends Tag<T>> extends IInstance<T> {

	default T withShadowColor(final String shadowColor_) {
		return self().attr("shadowColor", shadowColor_);
	}

	default T withCondShadowColor(final boolean enable, final String shadowColor_) {
		if (enable) {
			self().attr("shadowColor", shadowColor_);
		}
		return self();
	}

}
