package dev.rebelcraft.j2hyperview.display.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

import static dev.rebelcraft.j2hyperview.utils.AttributeTypes.name;

public interface ISafeArea<T extends Tag<T>> extends IInstance<T> {
	default T withSafeArea(final String safeArea_) {
		return self().attr("safe-area", safeArea_);
	}

	default T withCondSafeArea(final boolean enable, final String safeArea_) {
		if (enable) {
			self().attr("safe-area", safeArea_);
		}
		return self();
	}

}