package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IMaxHeight<T extends Tag<T>> extends IInstance<T> {

	default T withMaxHeight(final String maxHeight_) {
		return self().attr("maxHeight", maxHeight_);
	}

	default T withCondMaxHeight(final boolean enable, final String maxHeight_) {
		if (enable) {
			self().attr("maxHeight", maxHeight_);
		}
		return self();
	}

}
