package dev.rebelcraft.j2hyperview.display.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IKeyboardShouldPersistTaps<T extends Tag<T>> extends IInstance<T> {

	default T withKeyboardShouldPersistTaps(final String keyboardShouldPersistTaps_) {
		return self().attr("keyboard-should-persist-taps", keyboardShouldPersistTaps_);
	}

	default T withCondKeyboardShouldPersistTaps(final boolean enable, final String keyboardShouldPersistTaps_) {
		if (enable) {
			self().attr("keyboard-should-persist-taps", keyboardShouldPersistTaps_);
		}
		return self();
	}

}