package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IMinWidth<T extends Tag<T>> extends IInstance<T> {

	default T withMinWidth(final String minWidth_) {
		return self().attr("minWidth", minWidth_);
	}

	default T withCondMinWidth(final boolean enable, final String minWidth_) {
		if (enable) {
			self().attr("minWidth", minWidth_);
		}
		return self();
	}

}
