package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IName<T extends Tag<T>> extends IInstance<T> {

	default T withName(final String name_) {
		return self().attr("name", name_);
	}

	default T withCondName(final boolean enable, final String name_) {
		if (enable) {
			self().attr("name", name_);
		}
		return self();
	}

}