package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IZIndex<T extends Tag<T>> extends IInstance<T> {

	default T withZIndex(final String zIndex_) {
		return self().attr("zIndex", zIndex_);
	}

	default T withCondZIndex(final boolean enable, final String zIndex_) {
		if (enable) {
			self().attr("zIndex", zIndex_);
		}
		return self();
	}

}
