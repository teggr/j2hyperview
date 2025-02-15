package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IDisplay<T extends Tag<T>> extends IInstance<T> {

	default T withDisplay(final String display_) {
		return self().attr("display", display_);
	}

	default T withCondDisplay(final boolean enable, final String display_) {
		if (enable) {
			self().attr("display", display_);
		}
		return self();
	}

}
