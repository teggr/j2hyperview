package dev.rebelcraft.j2hyperview.behaviours.atributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

/**
 * get, post
 */
public interface IShareMessage<T extends Tag<T>> extends IInstance<T> {

	default T withShareMessage(final String message_) {
		return self().attr("share:message", message_);
	}

	default T withCondShareMessage(final boolean enable, final String message_) {
		if (enable) {
			self().attr("share:message", message_);
		}
		return self();
	}

}