package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface ITextContentType<T extends Tag<T>> extends IInstance<T> {

	default T withTextContentType(final String textContentType_) {
		return self().attr("text-content-type", textContentType_);
	}

	default T withCondTextContentType(final boolean enable, final String textContentType_) {
		if (enable) {
			self().attr("text-content-type", textContentType_);
		}
		return self();
	}

}