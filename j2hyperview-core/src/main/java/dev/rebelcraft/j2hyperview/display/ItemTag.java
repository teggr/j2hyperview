package dev.rebelcraft.j2hyperview.display;

import dev.rebelcraft.j2hyperview.behaviours.atributes.IStandardBehaviours;
import dev.rebelcraft.j2hyperview.display.attributes.IKey;
import dev.rebelcraft.j2hyperview.display.attributes.ISticky;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.IHide;
import dev.rebelcraft.j2hyperview.tags.attributes.IId;
import dev.rebelcraft.j2hyperview.tags.attributes.IStyle;

public class ItemTag extends ContainerTag<ItemTag> implements
		IStandardBehaviours<ItemTag>,
		IKey<ItemTag>,
		IStyle<ItemTag>,
		IId<ItemTag>,
		IHide<ItemTag>,
		ISticky<ItemTag>
{
	public ItemTag(  ) {
		super( "items" );
	}
}
