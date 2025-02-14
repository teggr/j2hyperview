package dev.rebelcraft.j2hyperview.behaviours.atributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

import static dev.rebelcraft.j2hyperview.utils.AttributeTypes.name;

public interface ITrigger<T extends Tag<T>> extends IInstance<T> {

	default T withTrigger(final String trigger_) {
		return self().attr("trigger", trigger_);
	}

	default T withCondTrigger(final boolean enable, final String trigger_) {
		if (enable) {
			self().attr("trigger", trigger_);
		}
		return self();
	}

	default T withTrigger(final Type trigger_) {
		return self().attr("trigger", name(trigger_));
	}

	default T withCondTrigger(final boolean enable, final Type trigger_) {
		if (enable) {
			self().attr("trigger", name(trigger_));
		}
		return self();
	}

	enum Type { press, longPress, pressIn, pressOut, visible, refresh, load, select, deselect, focus, blur, change, on_event }

}