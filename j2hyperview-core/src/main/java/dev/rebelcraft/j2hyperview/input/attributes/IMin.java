package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IMin<T extends Tag<T>> extends IInstance<T> {

	default T withMin(final String min_) {
		return self().attr("min", min_);
	}

	default T withCondMin(final boolean enable, final String min_) {
		if (enable) {
			self().attr("min", min_);
		}
		return self();
	}

}