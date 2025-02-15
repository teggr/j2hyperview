package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IMultiline<T extends Tag<T>> extends IInstance<T> {

	default T withMultiline(final String multiline_) {
		return self().attr("multiline", multiline_);
	}

	default T withCondMultiline(final boolean enable, final String multiline_) {
		if (enable) {
			self().attr("multiline", multiline_);
		}
		return self();
	}

}