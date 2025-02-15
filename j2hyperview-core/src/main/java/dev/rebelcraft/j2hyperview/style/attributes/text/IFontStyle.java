package dev.rebelcraft.j2hyperview.style.attributes.text;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IFontStyle<T extends Tag<T>> extends IInstance<T> {

	default T withFontStyle(final String fontStyle_) {
		return self().attr("fontStyle", fontStyle_);
	}

	default T withCondFontStyle(final boolean enable, final String fontStyle_) {
		if (enable) {
			self().attr("fontStyle", fontStyle_);
		}
		return self();
	}

}
