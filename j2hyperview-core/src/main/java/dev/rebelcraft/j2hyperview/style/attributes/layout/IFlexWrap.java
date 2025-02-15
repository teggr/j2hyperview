package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IFlexWrap<T extends Tag<T>> extends IInstance<T> {

	default T withFlexWrap(final String flexWrap_) {
		return self().attr("flexWrap", flexWrap_);
	}

	default T withCondFlexWrap(final boolean enable, final String flexWrap_) {
		if (enable) {
			self().attr("flexWrap", flexWrap_);
		}
		return self();
	}

}
