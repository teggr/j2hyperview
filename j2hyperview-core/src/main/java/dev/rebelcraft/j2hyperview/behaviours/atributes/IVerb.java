package dev.rebelcraft.j2hyperview.behaviours.atributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;
import dev.rebelcraft.j2hyperview.utils.AttributeTypes;

import static dev.rebelcraft.j2hyperview.utils.AttributeTypes.*;

/**
 * get, post
 */
public interface IVerb<T extends Tag<T>> extends IInstance<T> {

	default T withVerb(final String verb_) {
		return self().attr("verb", verb_);
	}

	default T withCondVerb(final boolean enable, final String verb_) {
		if (enable) {
			self().attr("verb", verb_);
		}
		return self();
	}

	default T withVerb(final Type verb_) {
		return self().attr("verb", name(verb_));
	}

	default T withCondVerb(final boolean enable, final Type verb_) {
		if (enable) {
			self().attr("verb", name(verb_));
		}
		return self();
	}

	enum Type { get, post }

}