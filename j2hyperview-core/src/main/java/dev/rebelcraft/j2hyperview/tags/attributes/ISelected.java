package dev.rebelcraft.j2hyperview.tags.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface ISelected<T extends Tag<T>> extends IInstance<T> {
	default T withSelected(final String selected_) {
		return self().attr("selected", selected_);
	}

	default T withCondSelected(final boolean enable, final String selected_) {
		if (enable) {
			self().attr("selected", selected_);
		}
		return self();
	}
}