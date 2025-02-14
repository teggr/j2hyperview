package dev.rebelcraft.j2hyperview.display.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface ISelectable<T extends Tag<T>> extends IInstance<T> {

	default T withSelectable(final String selectable_) {
		return self().attr("selectable", selectable_);
	}

	default T withCondSelectable(final boolean enable, final String selectable_) {
		if (enable) {
			self().attr("selectable", selectable_);
		}
		return self();
	}

}