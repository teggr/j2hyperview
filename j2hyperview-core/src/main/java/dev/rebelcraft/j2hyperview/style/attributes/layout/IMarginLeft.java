package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IMarginLeft<T extends Tag<T>> extends IInstance<T> {

	default T withMarginLeft(final String marginLeft_) {
		return self().attr("marginLeft", marginLeft_);
	}

	default T withCondMarginLeft(final boolean enable, final String marginLeft_) {
		if (enable) {
			self().attr("marginLeft", marginLeft_);
		}
		return self();
	}

}
