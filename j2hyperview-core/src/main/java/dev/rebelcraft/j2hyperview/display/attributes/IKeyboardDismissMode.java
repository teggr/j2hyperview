package dev.rebelcraft.j2hyperview.display.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IKeyboardDismissMode<T extends Tag<T>> extends IInstance<T> {

	default T withKeyboardDismissMode(final String keyboardDismissMode_) {
		return self().attr("keyboard-dismiss-mode", keyboardDismissMode_);
	}

	default T withCondKeyboardDismissMode(final boolean enable, final String keyboardDismissMode_) {
		if (enable) {
			self().attr("keyboard-dismiss-mode", keyboardDismissMode_);
		}
		return self();
	}

}