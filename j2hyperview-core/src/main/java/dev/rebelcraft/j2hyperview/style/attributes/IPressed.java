package dev.rebelcraft.j2hyperview.style.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IPressed<T extends Tag<T>> extends IInstance<T> {

	default T withPressed(final String pressed_) {
		return self().attr("pressed", pressed_);
	}

	default T withCondPressed(final boolean enable, final String pressed_) {
		if (enable) {
			self().attr("pressed", pressed_);
		}
		return self();
	}

}
