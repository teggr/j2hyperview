package dev.rebelcraft.j2hyperview.tags.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IModal<T extends Tag<T>> extends IInstance<T> {
	default T withModal(final String modal_) {
		return self().attr("modal", modal_);
	}

	default T withCondModal(final boolean enable, final String modal_) {
		if (enable) {
			self().attr("modal", modal_);
		}
		return self();
	}
}