package dev.rebelcraft.j2hyperview.style.attributes.text;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface ILineHeight<T extends Tag<T>> extends IInstance<T> {

	default T withLineHeight(final String lineHeight_) {
		return self().attr("lineHeight", lineHeight_);
	}

	default T withCondLineHeight(final boolean enable, final String lineHeight_) {
		if (enable) {
			self().attr("lineHeight", lineHeight_);
		}
		return self();
	}

}
