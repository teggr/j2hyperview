package dev.rebelcraft.j2hyperview.display;

import dev.rebelcraft.j2hyperview.behaviours.atributes.ITrigger;
import dev.rebelcraft.j2hyperview.display.attributes.IColor;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.IHide;
import dev.rebelcraft.j2hyperview.tags.attributes.IId;

public class SpinnerTag extends ContainerTag<SpinnerTag> implements
		IColor<SpinnerTag>,
		IId<SpinnerTag>,
		IHide<SpinnerTag>
{
	public SpinnerTag(  ) {
		super( "spinner" );
	}
}
