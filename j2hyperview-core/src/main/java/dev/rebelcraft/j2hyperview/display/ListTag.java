package dev.rebelcraft.j2hyperview.display;

import dev.rebelcraft.j2hyperview.behaviours.atributes.IStandardBehaviours;
import dev.rebelcraft.j2hyperview.behaviours.atributes.ITrigger;
import dev.rebelcraft.j2hyperview.display.attributes.*;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.IHide;
import dev.rebelcraft.j2hyperview.tags.attributes.IId;
import dev.rebelcraft.j2hyperview.tags.attributes.IStyle;

import java.util.List;

public class ListTag extends ContainerTag<ListTag> implements
		IStandardBehaviours<ListTag>,
		IStyle<ListTag>,
		IItemHeight<ListTag>,
		IId<ListTag>,
		IHide<ListTag>,
		IScrollOrientation<ListTag>,
		IShowsScrollIndicator<ListTag>,
		IKeyboardDismissMode<ListTag>,
		IKeyboardShouldPersistTaps<ListTag>
{
	public ListTag(  ) {
		super( "list" );
	}
}
