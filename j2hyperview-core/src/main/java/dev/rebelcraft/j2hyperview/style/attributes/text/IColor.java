package dev.rebelcraft.j2hyperview.style.attributes.text;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IColor<T extends Tag<T>> extends IInstance<T> {

	default T withColor(final String color_) {
		return self().attr("color", color_);
	}

	default T withCondColor(final boolean enable, final String color_) {
		if (enable) {
			self().attr("color", color_);
		}
		return self();
	}

}
