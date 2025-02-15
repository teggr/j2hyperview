package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface ISecureText<T extends Tag<T>> extends IInstance<T> {

	default T withSecureText(final String secureText_) {
		return self().attr("secure-text", secureText_);
	}

	default T withCondSecureText(final boolean enable, final String secureText_) {
		if (enable) {
			self().attr("secure-text", secureText_);
		}
		return self();
	}

}