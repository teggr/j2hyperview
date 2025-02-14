package dev.rebelcraft.j2hyperview.behaviours.atributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

/**
 * get, post
 */
public interface IAlertTitle<T extends Tag<T>> extends IInstance<T> {

	default T withTitle(final String title_) {
		return self().attr("alert:title", title_);
	}

	default T withCondTitle(final boolean enable, final String title_) {
		if (enable) {
			self().attr("alert:title", title_);
		}
		return self();
	}

}