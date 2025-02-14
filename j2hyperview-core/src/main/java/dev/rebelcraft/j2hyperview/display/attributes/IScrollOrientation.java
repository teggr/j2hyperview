package dev.rebelcraft.j2hyperview.display.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IScrollOrientation<T extends Tag<T>> extends IInstance<T> {

	default T withScrollOrientation(final String scrollOrientation_) {
		return self().attr("scroll-orientation", scrollOrientation_);
	}

	default T withCondScrollOrientation(final boolean enable, final String scrollOrientation_) {
		if (enable) {
			self().attr("scroll-orientation", scrollOrientation_);
		}
		return self();
	}

}