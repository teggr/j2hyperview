package dev.rebelcraft.j2hyperview.display;

import dev.rebelcraft.j2hyperview.behaviours.atributes.*;
import dev.rebelcraft.j2hyperview.display.attributes.ISafeArea;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.IHide;
import dev.rebelcraft.j2hyperview.tags.attributes.IId;
import dev.rebelcraft.j2hyperview.tags.attributes.IStyle;

public class HeaderTag extends ContainerTag<HeaderTag> implements
		IStandardBehaviours<HeaderTag>,
		ISafeArea<HeaderTag>,
		IStyle<HeaderTag>,
		IId<HeaderTag>,
		IHide<HeaderTag> {
	public HeaderTag(  ) {
		super( "header" );
	}
}
