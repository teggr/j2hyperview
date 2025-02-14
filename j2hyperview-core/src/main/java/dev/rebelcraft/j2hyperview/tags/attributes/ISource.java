package dev.rebelcraft.j2hyperview.tags.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface ISource<T extends Tag<T>> extends IInstance<T> {
	default T withSource(final String source_) {
		return self().attr("source", source_);
	}

	default T withCondSource(final boolean enable, final String source_) {
		if (enable) {
			self().attr("source", source_);
		}
		return self();
	}
}