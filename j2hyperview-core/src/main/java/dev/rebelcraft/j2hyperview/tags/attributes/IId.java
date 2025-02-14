package dev.rebelcraft.j2hyperview.tags.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IId<T extends Tag<T>> extends IInstance<T> {
	default T withId(final String id_) {
		return self().attr("id", id_);
	}

	default T withCondId(final boolean enable, final String id_) {
		if (enable) {
			self().attr("id", id_);
		}
		return self();
	}
}