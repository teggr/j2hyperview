package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IPlaceholder<T extends Tag<T>> extends IInstance<T> {

	default T withPlaceholder(final String placeholder_) {
		return self().attr("placeholder", placeholder_);
	}

	default T withCondPlaceholder(final boolean enable, final String placeholder_) {
		if (enable) {
			self().attr("placeholder", placeholder_);
		}
		return self();
	}

}