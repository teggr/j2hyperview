package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IMask<T extends Tag<T>> extends IInstance<T> {

	default T withMask(final String mask_) {
		return self().attr("mask", mask_);
	}

	default T withCondMask(final boolean enable, final String mask_) {
		if (enable) {
			self().attr("mask", mask_);
		}
		return self();
	}

}