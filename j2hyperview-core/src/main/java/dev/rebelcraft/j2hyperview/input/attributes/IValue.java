package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IValue<T extends Tag<T>> extends IInstance<T> {

	default T withValue(final String value_) {
		return self().attr("value", value_);
	}

	default T withCondValue(final boolean enable, final String value_) {
		if (enable) {
			self().attr("value", value_);
		}
		return self();
	}

}