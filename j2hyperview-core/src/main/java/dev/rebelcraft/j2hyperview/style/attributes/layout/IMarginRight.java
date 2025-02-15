package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IMarginRight<T extends Tag<T>> extends IInstance<T> {

	default T withMarginRight(final String marginRight_) {
		return self().attr("marginRight", marginRight_);
	}

	default T withCondMarginRight(final boolean enable, final String marginRight_) {
		if (enable) {
			self().attr("marginRight", marginRight_);
		}
		return self();
	}

}
