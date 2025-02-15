package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface ILabelFormat<T extends Tag<T>> extends IInstance<T> {

	default T withLabelFormat(final String labelFormat_) {
		return self().attr("label-format", labelFormat_);
	}

	default T withCondLabelFormat(final boolean enable, final String labelFormat_) {
		if (enable) {
			self().attr("label-format", labelFormat_);
		}
		return self();
	}

}