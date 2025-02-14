package dev.rebelcraft.j2hyperview.behaviours.atributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

/**
 * get, post
 */
public interface IAlertMessage<T extends Tag<T>> extends IInstance<T> {

	default T withMessage(final String message_) {
		return self().attr("alert:message", message_);
	}

	default T withCondMessage(final boolean enable, final String message_) {
		if (enable) {
			self().attr("alert:message", message_);
		}
		return self();
	}

}