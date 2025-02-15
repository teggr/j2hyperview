package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IFieldStyle<T extends Tag<T>> extends IInstance<T> {

	default T withFieldStyle(final String fieldStyle_) {
		return self().attr("field-style", fieldStyle_);
	}

	default T withCondFieldStyle(final boolean enable, final String fieldStyle_) {
		if (enable) {
			self().attr("field-style", fieldStyle_);
		}
		return self();
	}

}