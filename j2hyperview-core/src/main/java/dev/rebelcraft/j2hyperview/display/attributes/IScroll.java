package dev.rebelcraft.j2hyperview.display.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IScroll<T extends Tag<T>> extends IInstance<T> {

	default T withScroll(final String scroll_) {
		return self().attr("scroll", scroll_);
	}

	default T withCondScroll(final boolean enable, final String scroll_) {
		if (enable) {
			self().attr("scroll", scroll_);
		}
		return self();
	}

}