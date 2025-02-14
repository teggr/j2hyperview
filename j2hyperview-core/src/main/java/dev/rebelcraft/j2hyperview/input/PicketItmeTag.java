package dev.rebelcraft.j2hyperview.input;

import dev.rebelcraft.j2hyperview.behaviours.atributes.IAction;
import dev.rebelcraft.j2hyperview.behaviours.atributes.IHref;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.IModal;
import dev.rebelcraft.j2hyperview.tags.attributes.ISelected;

public class PicketItmeTag extends ContainerTag<PicketItmeTag> implements IHref<PicketItmeTag>, IAction<PicketItmeTag>,
		ISelected<PicketItmeTag>, IModal<PicketItmeTag> {
	public PicketItmeTag(  ) {
		super( "nav-route" );
	}
}
