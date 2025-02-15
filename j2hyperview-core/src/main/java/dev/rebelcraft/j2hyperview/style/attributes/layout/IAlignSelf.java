package dev.rebelcraft.j2hyperview.style.attributes.layout;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IAlignSelf<T extends Tag<T>> extends IInstance<T> {

	default T withAlignSelf(final String alignSelf_) {
		return self().attr("alignSelf", alignSelf_);
	}

	default T withCondAlignSelf(final boolean enable, final String alignSelf_) {
		if (enable) {
			self().attr("alignSelf", alignSelf_);
		}
		return self();
	}

}
