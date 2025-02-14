package dev.rebelcraft.j2hyperview.input;

import dev.rebelcraft.j2hyperview.behaviours.atributes.ITrigger;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;

public class OptionTag extends ContainerTag<OptionTag> implements ITrigger<OptionTag> {
	public OptionTag(  ) {
		super( "option" );
	}
}
