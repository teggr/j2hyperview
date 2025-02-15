package dev.rebelcraft.j2hyperview.style.attributes.view;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IOpacity<T extends Tag<T>> extends IInstance<T> {

	default T withOpacity(final String opacity_) {
		return self().attr("opacity", opacity_);
	}

	default T withCondOpacity(final boolean enable, final String opacity_) {
		if (enable) {
			self().attr("opacity", opacity_);
		}
		return self();
	}

}
