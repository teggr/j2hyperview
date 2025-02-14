package dev.rebelcraft.j2hyperview.input;

import dev.rebelcraft.j2hyperview.behaviours.atributes.ITrigger;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;

public class FormTag extends ContainerTag<FormTag> implements ITrigger<FormTag> {
	public FormTag(  ) {
		super( "option" );
	}
}
