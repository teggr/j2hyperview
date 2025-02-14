package dev.rebelcraft.j2hyperview.tags.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IStyle<T extends Tag<T>> extends IInstance<T> {
	default T withStyle(final String style_) {
		return self().attr("style", style_);
	}

	default T withCondStyle(final boolean enable, final String style_) {
		if (enable) {
			self().attr("style", style_);
		}
		return self();
	}
}