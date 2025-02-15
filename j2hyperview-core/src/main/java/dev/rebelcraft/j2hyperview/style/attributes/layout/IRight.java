package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IRight<T extends Tag<T>> extends IInstance<T> {

	default T withRight(final String right_) {
		return self().attr("right", right_);
	}

	default T withCondRight(final boolean enable, final String right_) {
		if (enable) {
			self().attr("right", right_);
		}
		return self();
	}

}
