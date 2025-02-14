package dev.rebelcraft.j2hyperview.input;

import dev.rebelcraft.j2hyperview.behaviours.atributes.ITrigger;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;

public class SwitchTag extends ContainerTag<SwitchTag> implements ITrigger<SwitchTag> {
	public SwitchTag(  ) {
		super( "switch" );
	}
}
