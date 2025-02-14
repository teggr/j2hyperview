package dev.rebelcraft.j2hyperview.display.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface INumberOfLines<T extends Tag<T>> extends IInstance<T> {

	default T withNumberOfLines(final String numberOfLines_) {
		return self().attr("numberOfLines", numberOfLines_);
	}

	default T withCondNumberOfLines(final boolean enable, final String numberOfLines_) {
		if (enable) {
			self().attr("numberOfLines", numberOfLines_);
		}
		return self();
	}

}