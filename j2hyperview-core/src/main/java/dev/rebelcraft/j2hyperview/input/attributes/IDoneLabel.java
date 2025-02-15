package dev.rebelcraft.j2hyperview.input.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IDoneLabel<T extends Tag<T>> extends IInstance<T> {

	default T withDoneLabel(final String doneLabel_) {
		return self().attr("done-label", doneLabel_);
	}

	default T withCondDoneLabel(final boolean enable, final String doneLabel_) {
		if (enable) {
			self().attr("done-label", doneLabel_);
		}
		return self();
	}

}