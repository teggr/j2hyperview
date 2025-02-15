package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IFlexDirection<T extends Tag<T>> extends IInstance<T> {

	default T withFlexDirection(final String flexDirection_) {
		return self().attr("flexDirection", flexDirection_);
	}

	default T withCondFlexDirection(final boolean enable, final String flexDirection_) {
		if (enable) {
			self().attr("flexDirection", flexDirection_);
		}
		return self();
	}

}
