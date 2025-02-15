package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IModalOverlayStyle<T extends Tag<T>> extends IInstance<T> {

	default T withModalOverlayStyle(final String modalOverlayStyle_) {
		return self().attr("modal-overlay-style", modalOverlayStyle_);
	}

	default T withCondModalOverlayStyle(final boolean enable, final String modalOverlayStyle_) {
		if (enable) {
			self().attr("modal-overlay-style", modalOverlayStyle_);
		}
		return self();
	}

}