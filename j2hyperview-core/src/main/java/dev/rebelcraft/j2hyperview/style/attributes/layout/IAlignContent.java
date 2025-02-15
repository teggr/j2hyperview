package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IAlignContent<T extends Tag<T>> extends IInstance<T> {

	default T withAlignContent(final String alignContent_) {
		return self().attr("alignContent", alignContent_);
	}

	default T withCondAlignContent(final boolean enable, final String alignContent_) {
		if (enable) {
			self().attr("alignContent", alignContent_);
		}
		return self();
	}

}
