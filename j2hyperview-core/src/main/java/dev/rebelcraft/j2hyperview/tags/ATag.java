package dev.rebelcraft.j2hyperview.tags;

import dev.rebelcraft.j2hyperview.behaviours.atributes.IAction;
import dev.rebelcraft.j2hyperview.behaviours.atributes.IHref;

public class ATag extends ContainerTag<ATag> implements IHref<ATag>, IAction<ATag> {
	public ATag(  ) {
		super( "a" );
	}
}
