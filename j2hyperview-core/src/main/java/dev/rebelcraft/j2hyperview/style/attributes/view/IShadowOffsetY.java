package dev.rebelcraft.j2hyperview.style.attributes.view;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IShadowOffsetY<T extends Tag<T>> extends IInstance<T> {

	default T withShadowOffsetY(final String shadowOffsetY_) {
		return self().attr("shadowOffsetY", shadowOffsetY_);
	}

	default T withCondShadowOffsetY(final boolean enable, final String shadowOffsetY_) {
		if (enable) {
			self().attr("shadowOffsetY", shadowOffsetY_);
		}
		return self();
	}

}
