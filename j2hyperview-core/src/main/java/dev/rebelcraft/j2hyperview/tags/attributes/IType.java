package dev.rebelcraft.j2hyperview.tags.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IType<T extends Tag<T>> extends IInstance<T> {
	default T withType(final String type_) {
		return self().attr("type", type_);
	}

	default T withCondType(final boolean enable, final String type_) {
		if (enable) {
			self().attr("type", type_);
		}
		return self();
	}
}