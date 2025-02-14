package dev.rebelcraft.j2hyperview.display.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IAvoidKeyboard<T extends Tag<T>> extends IInstance<T> {

	default T withAvoidKeyboard(final String avoidKeyboard_) {
		return self().attr("avoid-keyboard", avoidKeyboard_);
	}

	default T withCondAvoidKeyboard(final boolean enable, final String avoidKeyboard_) {
		if (enable) {
			self().attr("avoid-keyboard", avoidKeyboard_);
		}
		return self();
	}

}