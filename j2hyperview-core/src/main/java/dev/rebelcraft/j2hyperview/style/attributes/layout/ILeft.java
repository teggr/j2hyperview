package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface ILeft<T extends Tag<T>> extends IInstance<T> {

	default T withLeft(final String left_) {
		return self().attr("left", left_);
	}

	default T withCondLeft(final boolean enable, final String left_) {
		if (enable) {
			self().attr("left", left_);
		}
		return self();
	}

}
