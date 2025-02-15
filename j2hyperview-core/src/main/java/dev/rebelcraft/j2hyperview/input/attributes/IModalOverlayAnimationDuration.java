package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IModalOverlayAnimationDuration<T extends Tag<T>> extends IInstance<T> {

	default T withModalOverlayAnimationDuration(final String modalOverlayAnimationDuration_) {
		return self().attr("modal-overlay-animation-duration", modalOverlayAnimationDuration_);
	}

	default T withCondModalOverlayAnimationDuration(final boolean enable, final String modalOverlayAnimationDuration_) {
		if (enable) {
			self().attr("modal-overlay-animation-duration", modalOverlayAnimationDuration_);
		}
		return self();
	}

}