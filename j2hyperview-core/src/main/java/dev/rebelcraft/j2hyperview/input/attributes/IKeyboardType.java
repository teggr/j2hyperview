package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IKeyboardType<T extends Tag<T>> extends IInstance<T> {

	default T withKeyboardType(final String keyboardType_) {
		return self().attr("keyboardType", keyboardType_);
	}

	default T withCondKeyboardType(final boolean enable, final String keyboardType_) {
		if (enable) {
			self().attr("keyboardType", keyboardType_);
		}
		return self();
	}

}