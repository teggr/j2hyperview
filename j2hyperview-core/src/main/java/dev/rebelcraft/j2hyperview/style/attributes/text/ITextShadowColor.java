package dev.rebelcraft.j2hyperview.style.attributes.text;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface ITextShadowColor<T extends Tag<T>> extends IInstance<T> {

	default T withTextShadowColor(final String textShadowColor_) {
		return self().attr("textShadowColor", textShadowColor_);
	}

	default T withCondTextShadowColor(final boolean enable, final String textShadowColor_) {
		if (enable) {
			self().attr("textShadowColor", textShadowColor_);
		}
		return self();
	}

}
