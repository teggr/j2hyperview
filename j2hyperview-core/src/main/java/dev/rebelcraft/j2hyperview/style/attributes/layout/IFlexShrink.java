package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IFlexShrink<T extends Tag<T>> extends IInstance<T> {

	default T withFlexShrink(final String flexShrink_) {
		return self().attr("flexShrink", flexShrink_);
	}

	default T withCondFlexShrink(final boolean enable, final String flexShrink_) {
		if (enable) {
			self().attr("flexShrink", flexShrink_);
		}
		return self();
	}

}
