package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface ISelectionHandleColor<T extends Tag<T>> extends IInstance<T> {

	default T withSelectionHandleColor(final String selectionHandleColor_) {
		return self().attr("selectionHandleColor", selectionHandleColor_);
	}

	default T withCondSelectionHandleColor(final boolean enable, final String selectionHandleColor_) {
		if (enable) {
			self().attr("selectionHandleColor", selectionHandleColor_);
		}
		return self();
	}

}