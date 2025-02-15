package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IModalDimissAnimationDuration<T extends Tag<T>> extends IInstance<T> {

	default T withModalDismissAnimationDuration(final String modalDimissAnimationDuration_) {
		return self().attr("modal-dismiss-animation-duration", modalDimissAnimationDuration_);
	}

	default T withCondModalDismissAnimationDuration(final boolean enable, final String modalDimissAnimationDuration_) {
		if (enable) {
			self().attr("modal-dismiss-animation-duration", modalDimissAnimationDuration_);
		}
		return self();
	}

}