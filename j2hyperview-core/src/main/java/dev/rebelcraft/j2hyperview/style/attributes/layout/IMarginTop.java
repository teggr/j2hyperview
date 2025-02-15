package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IMarginTop<T extends Tag<T>> extends IInstance<T> {

	default T withMarginTop(final String marginTop_) {
		return self().attr("marginTop", marginTop_);
	}

	default T withCondMarginTop(final boolean enable, final String marginTop_) {
		if (enable) {
			self().attr("marginTop", marginTop_);
		}
		return self();
	}

}
