package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IMinHeight<T extends Tag<T>> extends IInstance<T> {

	default T withMinHeight(final String minHeight_) {
		return self().attr("minHeight", minHeight_);
	}

	default T withCondMinHeight(final boolean enable, final String minHeight_) {
		if (enable) {
			self().attr("minHeight", minHeight_);
		}
		return self();
	}

}
