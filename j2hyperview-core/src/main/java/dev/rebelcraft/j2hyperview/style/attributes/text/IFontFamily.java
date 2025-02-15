package dev.rebelcraft.j2hyperview.style.attributes.text;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IFontFamily<T extends Tag<T>> extends IInstance<T> {

	default T withFontFamily(final String fontFamily_) {
		return self().attr("fontFamily", fontFamily_);
	}

	default T withCondFontFamily(final boolean enable, final String fontFamily_) {
		if (enable) {
			self().attr("fontFamily", fontFamily_);
		}
		return self();
	}

}
