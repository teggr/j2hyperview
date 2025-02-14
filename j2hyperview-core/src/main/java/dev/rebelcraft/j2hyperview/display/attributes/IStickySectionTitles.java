package dev.rebelcraft.j2hyperview.display.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IStickySectionTitles<T extends Tag<T>> extends IInstance<T> {

	default T withStickySectionTitles(final String stickySectionTitles_) {
		return self().attr("sticky-section-titles", stickySectionTitles_);
	}

	default T withCondStickySectionTitles(final boolean enable, final String stickySectionTitles_) {
		if (enable) {
			self().attr("sticky-section-titles", stickySectionTitles_);
		}
		return self();
	}

}