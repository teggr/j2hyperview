package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IMode<T extends Tag<T>> extends IInstance<T> {

	default T withMode(final String mode_) {
		return self().attr("mode", mode_);
	}

	default T withCondMode(final boolean enable, final String mode_) {
		if (enable) {
			self().attr("mode", mode_);
		}
		return self();
	}

}