package dev.rebelcraft.j2hyperview.behaviours.atributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

/**
 * get, post
 */
public interface IAlertStyle<T extends Tag<T>> extends IInstance<T> {

	default T withAlertStyle(final String style_) {
		return self().attr("alert:style", style_);
	}

	default T withCondAlertStyle(final boolean enable, final String style_) {
		if (enable) {
			self().attr("alert:style", style_);
		}
		return self();
	}

}