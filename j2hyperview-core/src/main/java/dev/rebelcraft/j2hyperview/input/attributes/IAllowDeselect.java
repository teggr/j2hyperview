package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IAllowDeselect<T extends Tag<T>> extends IInstance<T> {

	default T withAllowDeselect(final String allowDeselect_) {
		return self().attr("allow-deselect", allowDeselect_);
	}

	default T withCondAllowDeselect(final boolean enable, final String allowDeselect_) {
		if (enable) {
			self().attr("allow-deselect", allowDeselect_);
		}
		return self();
	}

}