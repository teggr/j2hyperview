package dev.rebelcraft.j2hyperview.behaviours.atributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

/**
 * get, post
 */
public interface IShareDialogTitle<T extends Tag<T>> extends IInstance<T> {

	default T withShareDialogTitle(final String title_) {
		return self().attr("share:dialog-title", title_);
	}

	default T withCondShareDialogTitle(final boolean enable, final String title_) {
		if (enable) {
			self().attr("share:dialog-title", title_);
		}
		return self();
	}

}