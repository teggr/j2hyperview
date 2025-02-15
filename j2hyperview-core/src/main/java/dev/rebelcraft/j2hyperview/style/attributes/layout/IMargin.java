package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IMargin<T extends Tag<T>> extends IInstance<T> {

	default T withMargin(final String margin_) {
		return self().attr("margin", margin_);
	}

	default T withCondMargin(final boolean enable, final String margin_) {
		if (enable) {
			self().attr("margin", margin_);
		}
		return self();
	}

}
