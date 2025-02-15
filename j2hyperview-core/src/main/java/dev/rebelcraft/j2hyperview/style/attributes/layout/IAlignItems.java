package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IAlignItems<T extends Tag<T>> extends IInstance<T> {

	default T withAlignItems(final String alignItems_) {
		return self().attr("alignItems", alignItems_);
	}

	default T withCondAlignItems(final boolean enable, final String alignItems_) {
		if (enable) {
			self().attr("alignItems", alignItems_);
		}
		return self();
	}

}
