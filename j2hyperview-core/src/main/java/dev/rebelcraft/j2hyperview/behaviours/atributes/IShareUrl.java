package dev.rebelcraft.j2hyperview.behaviours.atributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

/**
 * get, post
 */
public interface IShareUrl<T extends Tag<T>> extends IInstance<T> {

	default T withShareUrl(final String url_) {
		return self().attr("share:url", url_);
	}

	default T withCondShareUrl(final boolean enable, final String url_) {
		if (enable) {
			self().attr("share:url", url_);
		}
		return self();
	}

}