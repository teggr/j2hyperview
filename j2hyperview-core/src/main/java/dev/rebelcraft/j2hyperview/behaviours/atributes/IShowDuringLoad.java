package dev.rebelcraft.j2hyperview.behaviours.atributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface IShowDuringLoad<T extends Tag<T>> extends IInstance<T> {
	default T withShowDuringLoad(final String... showDuringLoad_) {
		return self().attr("show-during-load", String.join(" ", showDuringLoad_));
	}

	default T withCondShowDuringLoad(final boolean enable, final String... showDuringLoad_) {
		if (enable) {
			self().attr("show-during-load", String.join(" ", showDuringLoad_));
		}
		return self();
	}
}