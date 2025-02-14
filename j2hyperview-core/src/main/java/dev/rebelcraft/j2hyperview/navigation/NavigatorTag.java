package dev.rebelcraft.j2hyperview.navigation;

import dev.rebelcraft.j2hyperview.behaviours.atributes.IAction;
import dev.rebelcraft.j2hyperview.behaviours.atributes.IHref;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.IType;

public class NavigatorTag extends ContainerTag<NavigatorTag> implements IHref<NavigatorTag>, IAction<NavigatorTag>,
		IType<NavigatorTag> {
	public NavigatorTag(  ) {
		super( "navigator" );
	}
}
