package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IModalTextStyle<T extends Tag<T>> extends IInstance<T> {

	default T withModalTextStyle(final String modalTextStyle_) {
		return self().attr("modal-text-style", modalTextStyle_);
	}

	default T withCondModalTextStyle(final boolean enable, final String modalTextStyle_) {
		if (enable) {
			self().attr("modal-text-style", modalTextStyle_);
		}
		return self();
	}

}