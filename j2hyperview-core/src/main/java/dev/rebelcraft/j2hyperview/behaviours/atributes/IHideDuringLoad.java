package dev.rebelcraft.j2hyperview.behaviours.atributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IHideDuringLoad<T extends Tag<T>> extends IInstance<T> {
	default T withHideDuringLoad(final String... hideDuringLoad_) {
		return self().attr("hide-during-load", String.join(" ", hideDuringLoad_));
	}

	default T withCondHideDuringLoad(final boolean enable, final String... hideDuringLoad_) {
		if (enable) {
			self().attr("hide-during-load", String.join(" ", hideDuringLoad_));
		}
		return self();
	}
}