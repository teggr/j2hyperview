package dev.rebelcraft.j2hyperview.display;

import dev.rebelcraft.j2hyperview.behaviours.atributes.IStandardBehaviours;
import dev.rebelcraft.j2hyperview.display.attributes.ISafeArea;
import dev.rebelcraft.j2hyperview.display.attributes.IScroll;
import dev.rebelcraft.j2hyperview.display.attributes.IScrollOrientation;
import dev.rebelcraft.j2hyperview.display.attributes.IShowsScrollIndicator;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.IId;
import dev.rebelcraft.j2hyperview.tags.attributes.IStyle;

public class BodyTag extends ContainerTag<BodyTag> implements
		IStandardBehaviours<BodyTag>,
		ISafeArea<BodyTag>,
		IStyle<BodyTag>,
		IScroll<BodyTag>,
		IScrollOrientation<BodyTag>,
		IShowsScrollIndicator<BodyTag>,
		IId<BodyTag> {
	public BodyTag(  ) {
		super( "body" );
	}
}
