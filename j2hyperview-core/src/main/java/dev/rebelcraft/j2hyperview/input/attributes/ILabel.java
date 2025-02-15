package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface ILabel<T extends Tag<T>> extends IInstance<T> {

	default T withLabel(final String label_) {
		return self().attr("label", label_);
	}

	default T withCondLabel(final boolean enable, final String label_) {
		if (enable) {
			self().attr("label", label_);
		}
		return self();
	}

}