package dev.rebelcraft.j2hyperview.display.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IActivityIndicatorColor<T extends Tag<T>> extends IInstance<T> {

	default T withActivityIndicatorColor(final String activityIndicatorColor_) {
		return self().attr("activity-indicator-color", activityIndicatorColor_);
	}

	default T withCondActivityIndicatorColor(final boolean enable, final String activityIndicatorColor_) {
		if (enable) {
			self().attr("activity-indicator-color", activityIndicatorColor_);
		}
		return self();
	}

}