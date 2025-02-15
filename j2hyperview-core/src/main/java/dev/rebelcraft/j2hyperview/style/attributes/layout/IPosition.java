package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IPosition<T extends Tag<T>> extends IInstance<T> {

	default T withPosition(final String position_) {
		return self().attr("position", position_);
	}

	default T withCondPosition(final boolean enable, final String position_) {
		if (enable) {
			self().attr("position", position_);
		}
		return self();
	}

}
