package dev.rebelcraft.j2hyperview.display.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IAdjustsFontSizeToFit<T extends Tag<T>> extends IInstance<T> {

	default T withAdjustsFontSizeToFit(final String adjustsFontSizeToFit_) {
		return self().attr("adjustsFontSizeToFit", adjustsFontSizeToFit_);
	}

	default T withCondAdjustsFontSizeToFit(final boolean enable, final String adjustsFontSizeToFit_) {
		if (enable) {
			self().attr("adjustsFontSizeToFit", adjustsFontSizeToFit_);
		}
		return self();
	}

}