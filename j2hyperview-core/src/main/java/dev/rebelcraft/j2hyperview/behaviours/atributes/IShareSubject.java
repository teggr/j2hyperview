package dev.rebelcraft.j2hyperview.behaviours.atributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

/**
 * get, post
 */
public interface IShareSubject<T extends Tag<T>> extends IInstance<T> {

	default T withShareSubject(final String subject_) {
		return self().attr("share:subject", subject_);
	}

	default T withCondShareSubject(final boolean enable, final String subject_) {
		if (enable) {
			self().attr("share:subject", subject_);
		}
		return self();
	}

}