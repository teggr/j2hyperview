package dev.rebelcraft.j2hyperview.navigation;

import dev.rebelcraft.j2hyperview.behaviours.atributes.IAction;
import dev.rebelcraft.j2hyperview.behaviours.atributes.IHref;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.IId;
import dev.rebelcraft.j2hyperview.tags.attributes.IModal;
import dev.rebelcraft.j2hyperview.tags.attributes.ISelected;

public class NavRouteTag extends ContainerTag<NavRouteTag> implements
		IId<NavRouteTag>,
		IHref<NavRouteTag>,
		ISelected<NavRouteTag>,
		IModal<NavRouteTag>
{
	public NavRouteTag(  ) {
		super( "nav-route" );
	}
}
