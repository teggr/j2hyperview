package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IFlex<T extends Tag<T>> extends IInstance<T> {

	default T withFlex(final String flex_) {
		return self().attr("flex", flex_);
	}

	default T withCondFlex(final boolean enable, final String flex_) {
		if (enable) {
			self().attr("flex", flex_);
		}
		return self();
	}

}
