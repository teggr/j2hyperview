package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IFlexBasis<T extends Tag<T>> extends IInstance<T> {

	default T withFlexBasis(final String flexBasis_) {
		return self().attr("flexBasis", flexBasis_);
	}

	default T withCondFlexBasis(final boolean enable, final String flexBasis_) {
		if (enable) {
			self().attr("flexBasis", flexBasis_);
		}
		return self();
	}

}
