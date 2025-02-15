package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IMarginBottom<T extends Tag<T>> extends IInstance<T> {

	default T withMarginBottom(final String marginBottom_) {
		return self().attr("marginBottom", marginBottom_);
	}

	default T withCondMarginBottom(final boolean enable, final String marginBottom_) {
		if (enable) {
			self().attr("marginBottom", marginBottom_);
		}
		return self();
	}

}
