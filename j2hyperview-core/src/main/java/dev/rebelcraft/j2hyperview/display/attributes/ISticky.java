package dev.rebelcraft.j2hyperview.display.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface ISticky<T extends Tag<T>> extends IInstance<T> {

	default T withSticky(final String sticky_) {
		return self().attr("sticky", sticky_);
	}

	default T withCondSticky(final boolean enable, final String sticky_) {
		if (enable) {
			self().attr("sticky", sticky_);
		}
		return self();
	}

}