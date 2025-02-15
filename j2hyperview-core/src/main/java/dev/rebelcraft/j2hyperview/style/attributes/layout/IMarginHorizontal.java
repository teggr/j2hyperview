package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IMarginHorizontal<T extends Tag<T>> extends IInstance<T> {

	default T withMarginHorizontal(final String marginHorizontal_) {
		return self().attr("marginHorizontal", marginHorizontal_);
	}

	default T withCondMarginHorizontal(final boolean enable, final String marginHorizontal_) {
		if (enable) {
			self().attr("marginHorizontal", marginHorizontal_);
		}
		return self();
	}

}
