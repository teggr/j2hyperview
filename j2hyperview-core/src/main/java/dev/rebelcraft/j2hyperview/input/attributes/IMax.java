package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IMax<T extends Tag<T>> extends IInstance<T> {

	default T withMax(final String max_) {
		return self().attr("max", max_);
	}

	default T withCondMax(final boolean enable, final String max_) {
		if (enable) {
			self().attr("max", max_);
		}
		return self();
	}

}