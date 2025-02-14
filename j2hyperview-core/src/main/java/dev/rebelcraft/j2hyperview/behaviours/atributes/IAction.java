package dev.rebelcraft.j2hyperview.behaviours.atributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

import static dev.rebelcraft.j2hyperview.utils.AttributeTypes.name;

public interface IAction<T extends Tag<T>> extends IInstance<T> {
	default T withAction(final String action_) {
		return self().attr("action", action_);
	}

	default T withCondAction(final boolean enable, final String action_) {
		if (enable) {
			self().attr("action", action_);
		}
		return self();
	}

	default T withAction(final Type action_) {
		return self().attr("action", name(action_));
	}

	default T withCondAction(final boolean enable, final Type action_) {
		if (enable) {
			self().attr("action", name(action_));
		}
		return self();
	}

	enum Type { push, new_, back, close, navigate, deep_link, open_settings, replace, replace_inner, append, prepend, reload, dispatch_event, show, hide, toggle, set_value, copy_to_clipboard, select_all, unselect_all }

}