package dev.rebelcraft.j2hyperview.display.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IShowsScrollIndicator<T extends Tag<T>> extends IInstance<T> {

	default T withShowsScrollIndicator(final String showsScrollIndicator_) {
		return self().attr("shows-scroll-indicator", showsScrollIndicator_);
	}

	default T withCondShowsScrollIndicator(final boolean enable, final String showsScrollIndicator_) {
		if (enable) {
			self().attr("shows-scroll-indicator", showsScrollIndicator_);
		}
		return self();
	}

}