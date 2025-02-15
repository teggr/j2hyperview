package dev.rebelcraft.j2hyperview.style.attributes.view;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IBorderStyle<T extends Tag<T>> extends IInstance<T> {

	default T withBorderStyle(final String borderStyle_) {
		return self().attr("borderStyle", borderStyle_);
	}

	default T withCondBorderStyle(final boolean enable, final String borderStyle_) {
		if (enable) {
			self().attr("borderStyle", borderStyle_);
		}
		return self();
	}

}
