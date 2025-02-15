package dev.rebelcraft.j2hyperview.style.attributes.text;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IFontSize<T extends Tag<T>> extends IInstance<T> {

	default T withFontSize(final String fontSize_) {
		return self().attr("fontSize", fontSize_);
	}

	default T withCondFontSize(final boolean enable, final String fontSize_) {
		if (enable) {
			self().attr("fontSize", fontSize_);
		}
		return self();
	}

}
