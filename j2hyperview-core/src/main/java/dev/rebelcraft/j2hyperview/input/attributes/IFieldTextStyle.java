package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IFieldTextStyle<T extends Tag<T>> extends IInstance<T> {

	default T withFieldTextStyle(final String fieldTextStyle_) {
		return self().attr("field-text-style", fieldTextStyle_);
	}

	default T withCondFieldTextStyle(final boolean enable, final String fieldTextStyle_) {
		if (enable) {
			self().attr("field-text-style", fieldTextStyle_);
		}
		return self();
	}

}