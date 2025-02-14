package dev.rebelcraft.j2hyperview.tags.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IHide<T extends Tag<T>> extends IInstance<T> {
	default T withHide(final String hide_) {
		return self().attr("hide", hide_);
	}

	default T withCondHide(final boolean enable, final String hide_) {
		if (enable) {
			self().attr("hide", hide_);
		}
		return self();
	}
}