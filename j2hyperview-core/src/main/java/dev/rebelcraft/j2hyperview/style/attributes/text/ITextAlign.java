package dev.rebelcraft.j2hyperview.style.attributes.text;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface ITextAlign<T extends Tag<T>> extends IInstance<T> {

	default T withTextAlign(final String textAlign_) {
		return self().attr("textAlign", textAlign_);
	}

	default T withCondTextAlign(final boolean enable, final String textAlign_) {
		if (enable) {
			self().attr("textAlign", textAlign_);
		}
		return self();
	}

}
