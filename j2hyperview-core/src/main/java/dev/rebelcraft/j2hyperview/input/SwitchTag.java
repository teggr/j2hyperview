package dev.rebelcraft.j2hyperview.input;

import dev.rebelcraft.j2hyperview.behaviours.atributes.IStandardBehaviours;
import dev.rebelcraft.j2hyperview.behaviours.atributes.ITrigger;
import dev.rebelcraft.j2hyperview.input.attributes.IName;
import dev.rebelcraft.j2hyperview.input.attributes.IValue;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.IHide;
import dev.rebelcraft.j2hyperview.tags.attributes.IId;
import dev.rebelcraft.j2hyperview.tags.attributes.IStyle;

public class SwitchTag extends ContainerTag<SwitchTag> implements
		IStandardBehaviours<SwitchTag>,
		IName<SwitchTag>,
		IValue<SwitchTag>,
		IStyle<SwitchTag>,
		IId<SwitchTag>,
		IHide<SwitchTag>
{
	public SwitchTag(  ) {
		super( "switch" );
	}
}
