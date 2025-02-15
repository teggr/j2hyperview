package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IAutoFocus<T extends Tag<T>> extends IInstance<T> {

	default T withAutoFocus(final String autoFocus_) {
		return self().attr("auto-focus", autoFocus_);
	}

	default T withCondAutoFocus(final boolean enable, final String autoFocus_) {
		if (enable) {
			self().attr("auto-focus", autoFocus_);
		}
		return self();
	}

}