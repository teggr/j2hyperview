package dev.rebelcraft.j2hyperview.input;

import dev.rebelcraft.j2hyperview.input.attributes.IAllowDeselect;
import dev.rebelcraft.j2hyperview.input.attributes.IName;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.IHide;
import dev.rebelcraft.j2hyperview.tags.attributes.IId;
import dev.rebelcraft.j2hyperview.tags.attributes.IStyle;

public class SelectSingleTag extends ContainerTag<SelectSingleTag> implements
		IName<SelectSingleTag>,
		IStyle<SelectSingleTag>,
		IId<SelectSingleTag>,
		IHide<SelectSingleTag>,
		IAllowDeselect<SelectSingleTag>
{
	public SelectSingleTag(  ) {
		super( "select-single" );
	}
}
