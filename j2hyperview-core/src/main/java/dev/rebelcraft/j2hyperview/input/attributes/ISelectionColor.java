package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface ISelectionColor<T extends Tag<T>> extends IInstance<T> {

	default T withSelectionColor(final String selectionColor_) {
		return self().attr("selectionColor", selectionColor_);
	}

	default T withCondSelectionColor(final boolean enable, final String selectionColor_) {
		if (enable) {
			self().attr("selectionColor", selectionColor_);
		}
		return self();
	}

}