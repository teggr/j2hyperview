package dev.rebelcraft.j2hyperview.display.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IKey<T extends Tag<T>> extends IInstance<T> {

	default T withKey(final String key_) {
		return self().attr("key", key_);
	}

	default T withCondKey(final boolean enable, final String key_) {
		if (enable) {
			self().attr("key", key_);
		}
		return self();
	}

}