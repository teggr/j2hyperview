package dev.rebelcraft.j2hyperview.input;

import dev.rebelcraft.j2hyperview.input.attributes.IValue;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.IHide;
import dev.rebelcraft.j2hyperview.tags.attributes.IId;
import dev.rebelcraft.j2hyperview.tags.attributes.IStyle;

public class OptionTag extends ContainerTag<OptionTag> implements
		IValue<OptionTag>,
		IStyle<OptionTag>,
		IId<OptionTag>,
		IHide<OptionTag>
{
	public OptionTag(  ) {
		super( "option" );
	}
}
