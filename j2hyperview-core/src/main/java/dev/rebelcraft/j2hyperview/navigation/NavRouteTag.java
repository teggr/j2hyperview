package dev.rebelcraft.j2hyperview.navigation;

import dev.rebelcraft.j2hyperview.behaviours.atributes.IAction;
import dev.rebelcraft.j2hyperview.behaviours.atributes.IHref;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.IModal;
import dev.rebelcraft.j2hyperview.tags.attributes.ISelected;

public class NavRouteTag extends ContainerTag<NavRouteTag> implements IHref<NavRouteTag>, IAction<NavRouteTag>,
		ISelected<NavRouteTag>, IModal<NavRouteTag> {
	public NavRouteTag(  ) {
		super( "nav-route" );
	}
}
