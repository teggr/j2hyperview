package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IMaxWidth<T extends Tag<T>> extends IInstance<T> {

	default T withMaxWidth(final String maxWidth_) {
		return self().attr("maxWidth", maxWidth_);
	}

	default T withCondMaxWidth(final boolean enable, final String maxWidth_) {
		if (enable) {
			self().attr("maxWidth", maxWidth_);
		}
		return self();
	}

}
