package dev.rebelcraft.j2hyperview.behaviours.atributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

/**
 * relative, absolute, #fragment
 */
public interface IDelay<T extends Tag<T>> extends IInstance<T> {
	default T withDelay(final String delay_) {
		return self().attr("delay", delay_);
	}

	default T withCondDelay(final boolean enable, final String delay_) {
		if (enable) {
			self().attr("delay", delay_);
		}
		return self();
	}
}