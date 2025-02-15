package dev.rebelcraft.j2hyperview.style.attributes.view;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IElevation<T extends Tag<T>> extends IInstance<T> {

	default T withElevation(final String elevation_) {
		return self().attr("elevation", elevation_);
	}

	default T withCondElevation(final boolean enable, final String elevation_) {
		if (enable) {
			self().attr("elevation", elevation_);
		}
		return self();
	}

}
