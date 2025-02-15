package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IPlaceholderTextColor<T extends Tag<T>> extends IInstance<T> {

	default T withPlaceholderTextColor(final String placeholderTextColor_) {
		return self().attr("placeholderTextColor", placeholderTextColor_);
	}

	default T withCondPlaceholderTextColor(final boolean enable, final String placeholderTextColor_) {
		if (enable) {
			self().attr("placeholderTextColor", placeholderTextColor_);
		}
		return self();
	}

}