package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IPadding<T extends Tag<T>> extends IInstance<T> {

	default T withPadding(final String padding_) {
		return self().attr("padding", padding_);
	}

	default T withCondPadding(final boolean enable, final String padding_) {
		if (enable) {
			self().attr("padding", padding_);
		}
		return self();
	}

}
