package dev.rebelcraft.j2hyperview.behaviours.atributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

/**
 * get, post
 */
public interface IAlertLabel<T extends Tag<T>> extends IInstance<T> {

	default T withAlertLabel(final String label_) {
		return self().attr("alert:label", label_);
	}

	default T withCondAlertLabel(final boolean enable, final String label_) {
		if (enable) {
			self().attr("alert:label", label_);
		}
		return self();
	}

}