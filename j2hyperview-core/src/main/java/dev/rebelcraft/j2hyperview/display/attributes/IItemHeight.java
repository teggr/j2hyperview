package dev.rebelcraft.j2hyperview.display.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IItemHeight<T extends Tag<T>> extends IInstance<T> {

	default T withItemHeight(final String itemHeight_) {
		return self().attr("itemHeight", itemHeight_);
	}

	default T withCondItemHeight(final boolean enable, final String itemHeight_) {
		if (enable) {
			self().attr("itemHeight", itemHeight_);
		}
		return self();
	}

}