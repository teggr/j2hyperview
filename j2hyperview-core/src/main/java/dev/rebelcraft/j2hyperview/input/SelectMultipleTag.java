package dev.rebelcraft.j2hyperview.input;

import dev.rebelcraft.j2hyperview.input.attributes.IName;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.IHide;
import dev.rebelcraft.j2hyperview.tags.attributes.IId;
import dev.rebelcraft.j2hyperview.tags.attributes.IStyle;

public class SelectMultipleTag extends ContainerTag<SelectMultipleTag> implements
		IName<SelectMultipleTag>,
		IStyle<SelectMultipleTag>,
		IId<SelectMultipleTag>,
		IHide<SelectMultipleTag>
{
	public SelectMultipleTag(  ) {
		super( "select-multiple" );
	}
}
