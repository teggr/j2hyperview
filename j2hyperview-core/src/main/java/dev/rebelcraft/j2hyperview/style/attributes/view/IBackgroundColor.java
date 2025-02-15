package dev.rebelcraft.j2hyperview.style.attributes.view;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IBackgroundColor<T extends Tag<T>> extends IInstance<T> {

	default T withBackgroundColor(final String backgroundColor_) {
		return self().attr("backgroundColor", backgroundColor_);
	}

	default T withCondBackgroundColor(final boolean enable, final String backgroundColor_) {
		if (enable) {
			self().attr("backgroundColor", backgroundColor_);
		}
		return self();
	}

}
