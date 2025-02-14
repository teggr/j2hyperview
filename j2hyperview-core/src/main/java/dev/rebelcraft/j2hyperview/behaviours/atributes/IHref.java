package dev.rebelcraft.j2hyperview.behaviours.atributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

/**
 * relative, absolute, #fragment
 */
public interface IHref<T extends Tag<T>> extends IInstance<T> {
	default T withHref(final String href_) {
		return self().attr("href", href_);
	}

	default T withCondHref(final boolean enable, final String href_) {
		if (enable) {
			self().attr("href", href_);
		}
		return self();
	}
}