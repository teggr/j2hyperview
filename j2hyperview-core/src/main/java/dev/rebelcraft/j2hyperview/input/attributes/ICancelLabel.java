package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface ICancelLabel<T extends Tag<T>> extends IInstance<T> {

	default T withCancelLabel(final String cancelLabel_) {
		return self().attr("cancel-label", cancelLabel_);
	}

	default T withCondCancelLabel(final boolean enable, final String cancelLabel_) {
		if (enable) {
			self().attr("cancel-label", cancelLabel_);
		}
		return self();
	}

}