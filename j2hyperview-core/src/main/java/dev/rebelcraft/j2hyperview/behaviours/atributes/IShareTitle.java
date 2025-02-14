package dev.rebelcraft.j2hyperview.behaviours.atributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

/**
 * get, post
 */
public interface IShareTitle<T extends Tag<T>> extends IInstance<T> {

	default T withShareTitle(final String title_) {
		return self().attr("share:title", title_);
	}

	default T withCondShareTitle(final boolean enable, final String title_) {
		if (enable) {
			self().attr("share:title", title_);
		}
		return self();
	}

}