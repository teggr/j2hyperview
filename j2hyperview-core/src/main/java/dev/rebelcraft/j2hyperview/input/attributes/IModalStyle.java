package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IModalStyle<T extends Tag<T>> extends IInstance<T> {

	default T withModalStyle(final String modalStyle_) {
		return self().attr("modal-style", modalStyle_);
	}

	default T withCondModalStyle(final boolean enable, final String modalStyle_) {
		if (enable) {
			self().attr("modal-style", modalStyle_);
		}
		return self();
	}

}