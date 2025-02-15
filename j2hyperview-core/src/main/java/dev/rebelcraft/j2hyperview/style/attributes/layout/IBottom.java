package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IBottom<T extends Tag<T>> extends IInstance<T> {

	default T withBottom(final String bottom_) {
		return self().attr("bottom", bottom_);
	}

	default T withCondBottom(final boolean enable, final String bottom_) {
		if (enable) {
			self().attr("bottom", bottom_);
		}
		return self();
	}

}
