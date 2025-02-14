package dev.rebelcraft.j2hyperview.tags.attributes;

import dev.rebelcraft.j2hyperview.tags.IInstance;
import dev.rebelcraft.j2hyperview.tags.Tag;

public interface ICSSStyle<T extends Tag<T>> extends IInstance<T> {
	default T withBackgroundColor(final String backgroundColor_) {
		return self().attr("backgroundColor", backgroundColor_);
	}

	default T withCondBackgroundColor(final boolean enable, final String backgroundColor_) {
		if (enable) {
			self().attr("backgroundColor", backgroundColor_);
		}
		return self();
	}
	default T withFlex(final String flex_) {
		return self().attr("flex", flex_);
	}

	default T withCondFlex(final boolean enable, final String flex_) {
		if (enable) {
			self().attr("flex", flex_);
		}
		return self();
	}
	default T withPadding(final String padding_) {
		return self().attr("padding", padding_);
	}

	default T withCondPadding(final boolean enable, final String padding_) {
		if (enable) {
			self().attr("padding", padding_);
		}
		return self();
	}
	default T withFontSize(final String fontSize_) {
		return self().attr("fontSize", fontSize_);
	}

	default T withCondFontSize(final boolean enable, final String fontSize_) {
		if (enable) {
			self().attr("fontSize", fontSize_);
		}
		return self();
	}
	default T withLineHeight(final String lineHeight_) {
		return self().attr("lineHeight", lineHeight_);
	}

	default T withCondLineHeight(final boolean enable, final String lineHeight_) {
		if (enable) {
			self().attr("lineHeight", lineHeight_);
		}
		return self();
	}
	default T withColor(final String color_) {
		return self().attr("color", color_);
	}

	default T withCondColor(final boolean enable, final String color_) {
		if (enable) {
			self().attr("color", color_);
		}
		return self();
	}
}