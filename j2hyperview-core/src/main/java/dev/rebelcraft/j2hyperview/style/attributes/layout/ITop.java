package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface ITop<T extends Tag<T>> extends IInstance<T> {

	default T withTop(final String top_) {
		return self().attr("top", top_);
	}

	default T withCondTop(final boolean enable, final String top_) {
		if (enable) {
			self().attr("top", top_);
		}
		return self();
	}

}
