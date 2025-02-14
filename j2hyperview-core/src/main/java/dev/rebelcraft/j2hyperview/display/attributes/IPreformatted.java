package dev.rebelcraft.j2hyperview.display.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IPreformatted<T extends Tag<T>> extends IInstance<T> {

	default T withPreformatted(final String preformatted_) {
		return self().attr("preformatted", preformatted_);
	}

	default T withCondPreformatted(final boolean enable, final String preformatted_) {
		if (enable) {
			self().attr("preformatted", preformatted_);
		}
		return self();
	}

}