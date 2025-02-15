package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IAspectRatio<T extends Tag<T>> extends IInstance<T> {

	default T withAspectRatio(final String aspectRatio_) {
		return self().attr("aspectRatio", aspectRatio_);
	}

	default T withCondAspectRatio(final boolean enable, final String aspectRatio_) {
		if (enable) {
			self().attr("aspectRatio", aspectRatio_);
		}
		return self();
	}

}
