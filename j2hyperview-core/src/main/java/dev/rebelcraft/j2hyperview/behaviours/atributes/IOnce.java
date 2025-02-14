package dev.rebelcraft.j2hyperview.behaviours.atributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

/**
 * relative, absolute, #fragment
 */
public interface IOnce<T extends Tag<T>> extends IInstance<T> {
	default T withOnce(final String once_) {
		return self().attr("once", once_);
	}

	default T withCondOnce(final boolean enable, final String once_) {
		if (enable) {
			self().attr("once", once_);
		}
		return self();
	}
}