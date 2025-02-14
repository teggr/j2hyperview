package dev.rebelcraft.j2hyperview.display.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IShowLoadingIndicator<T extends Tag<T>> extends IInstance<T> {

	default T withShowLoadingIndicator(final String showLoadingIndicator_) {
		return self().attr("show-loading-indicator", showLoadingIndicator_);
	}

	default T withCondShowLoadingIndicator(final boolean enable, final String showLoadingIndicator_) {
		if (enable) {
			self().attr("show-loading-indicator", showLoadingIndicator_);
		}
		return self();
	}

}