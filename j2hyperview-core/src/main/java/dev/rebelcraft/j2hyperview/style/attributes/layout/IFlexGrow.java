package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IFlexGrow<T extends Tag<T>> extends IInstance<T> {

	default T withFlexGrow(final String flexGrow_) {
		return self().attr("flexGrow", flexGrow_);
	}

	default T withCondFlexGrow(final boolean enable, final String flexGrow_) {
		if (enable) {
			self().attr("flexGrow", flexGrow_);
		}
		return self();
	}

}
