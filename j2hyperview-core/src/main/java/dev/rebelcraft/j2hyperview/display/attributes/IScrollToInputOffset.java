package dev.rebelcraft.j2hyperview.display.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IScrollToInputOffset<T extends Tag<T>> extends IInstance<T> {

	default T withScrollToInputOffset(final String scrollToInputOffset_) {
		return self().attr("scroll-to-input-offset", scrollToInputOffset_);
	}

	default T withCondScrollToInputOffset(final boolean enable, final String scrollToInputOffset_) {
		if (enable) {
			self().attr("scroll-to-input-offset", scrollToInputOffset_);
		}
		return self();
	}

}