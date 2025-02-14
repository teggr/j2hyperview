package dev.rebelcraft.j2hyperview.tags.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IMerge<T extends Tag<T>> extends IInstance<T> {
	default T withMerge(final String merge_) {
		return self().attr("merge", merge_);
	}

	default T withCondMerge(final boolean enable, final String merge_) {
		if (enable) {
			self().attr("merge", merge_);
		}
		return self();
	}
}