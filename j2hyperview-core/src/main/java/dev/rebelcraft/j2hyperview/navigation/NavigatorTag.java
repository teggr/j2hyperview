package dev.rebelcraft.j2hyperview.navigation;

import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.IId;
import dev.rebelcraft.j2hyperview.tags.attributes.IMerge;
import dev.rebelcraft.j2hyperview.tags.attributes.IModal;
import dev.rebelcraft.j2hyperview.tags.attributes.IType;

public class NavigatorTag extends ContainerTag<NavigatorTag> implements
		IId<NavigatorTag>,
		IType<NavigatorTag>,
		IMerge<NavigatorTag>,
		IModal<NavigatorTag>
{
	public NavigatorTag(  ) {
		super( "navigator" );
	}
}
