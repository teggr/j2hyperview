package dev.rebelcraft.j2hyperview.style.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IFocused<T extends Tag<T>> extends IInstance<T> {

	default T withFocused(final String focused_) {
		return self().attr("focused", focused_);
	}

	default T withCondFocused(final boolean enable, final String focused_) {
		if (enable) {
			self().attr("focused", focused_);
		}
		return self();
	}

}
