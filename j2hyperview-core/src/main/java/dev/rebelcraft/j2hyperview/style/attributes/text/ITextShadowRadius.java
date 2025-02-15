package dev.rebelcraft.j2hyperview.style.attributes.text;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface ITextShadowRadius<T extends Tag<T>> extends IInstance<T> {

	default T withTextShadowRadius(final String textShadowRadius_) {
		return self().attr("textShadowRadius", textShadowRadius_);
	}

	default T withCondTextShadowRadius(final boolean enable, final String textShadowRadius_) {
		if (enable) {
			self().attr("textShadowRadius", textShadowRadius_);
		}
		return self();
	}

}
