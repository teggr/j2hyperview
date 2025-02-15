package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IMarginVertical<T extends Tag<T>> extends IInstance<T> {

	default T withMarginVertical(final String marginVertical_) {
		return self().attr("marginVertical", marginVertical_);
	}

	default T withCondMarginVertical(final boolean enable, final String marginVertical_) {
		if (enable) {
			self().attr("marginVertical", marginVertical_);
		}
		return self();
	}

}
