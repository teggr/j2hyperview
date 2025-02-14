package dev.rebelcraft.j2hyperview.display.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IInjectedJavaScript<T extends Tag<T>> extends IInstance<T> {

	default T withInjectedJavaScript(final String InjectedJavaScript_) {
		return self().attr("injected-java-script", InjectedJavaScript_);
	}

	default T withCondInjectedJavaScript(final boolean enable, final String InjectedJavaScript_) {
		if (enable) {
			self().attr("injected-java-script", InjectedJavaScript_);
		}
		return self();
	}

}