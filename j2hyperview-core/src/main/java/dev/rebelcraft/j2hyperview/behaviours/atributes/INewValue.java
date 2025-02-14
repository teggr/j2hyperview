package dev.rebelcraft.j2hyperview.behaviours.atributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

/**
 * relative, absolute, #fragment
 */
public interface INewValue<T extends Tag<T>> extends IInstance<T> {
	default T withNewValue(final String newValue_) {
		return self().attr("new-value", newValue_);
	}

	default T withCondNewValue(final boolean enable, final String newValue_) {
		if (enable) {
			self().attr("new-value", newValue_);
		}
		return self();
	}
}