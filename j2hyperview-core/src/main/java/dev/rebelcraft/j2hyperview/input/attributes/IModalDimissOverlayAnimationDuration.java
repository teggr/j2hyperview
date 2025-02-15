package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IModalDimissOverlayAnimationDuration<T extends Tag<T>> extends IInstance<T> {

	default T withModalDimissOverlayAnimationDuration(final String modalDimissOverlayAnimationDuration_) {
		return self().attr("modal-dismiss-overlay-animation-duration", modalDimissOverlayAnimationDuration_);
	}

	default T withCondModalDimissOverlayAnimationDuration(final boolean enable, final String modalDimissOverlayAnimationDuration_) {
		if (enable) {
			self().attr("modal-dismiss-overlay-animation-duration", modalDimissOverlayAnimationDuration_);
		}
		return self();
	}

}