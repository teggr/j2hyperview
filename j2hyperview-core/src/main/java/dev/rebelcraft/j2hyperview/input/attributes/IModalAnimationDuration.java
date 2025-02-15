package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IModalAnimationDuration<T extends Tag<T>> extends IInstance<T> {

	default T withModalAnimationDuration(final String modalAnimationDuration_) {
		return self().attr("modal-animation-duration", modalAnimationDuration_);
	}

	default T withCondModalAnimationDuration(final boolean enable, final String modalAnimationDuration_) {
		if (enable) {
			self().attr("modal-animation-duration", modalAnimationDuration_);
		}
		return self();
	}

}