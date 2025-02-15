package dev.rebelcraft.j2hyperview.style.attributes.view;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IShadowOffsetX<T extends Tag<T>> extends IInstance<T> {

	default T withShadowOffsetX(final String shadowOffsetX_) {
		return self().attr("shadowOffsetX", shadowOffsetX_);
	}

	default T withCondShadowOffsetX(final boolean enable, final String shadowOffsetX_) {
		if (enable) {
			self().attr("shadowOffsetX", shadowOffsetX_);
		}
		return self();
	}

}
