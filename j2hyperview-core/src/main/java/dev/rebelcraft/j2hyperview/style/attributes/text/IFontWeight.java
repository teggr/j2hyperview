package dev.rebelcraft.j2hyperview.style.attributes.text;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IFontWeight<T extends Tag<T>> extends IInstance<T> {

	default T withFontWeight(final String fontWeight_) {
		return self().attr("fontWeight", fontWeight_);
	}

	default T withCondFontWeight(final boolean enable, final String fontWeight_) {
		if (enable) {
			self().attr("fontWeight", fontWeight_);
		}
		return self();
	}

}
