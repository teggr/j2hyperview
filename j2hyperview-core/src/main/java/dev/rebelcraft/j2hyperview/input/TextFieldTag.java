package dev.rebelcraft.j2hyperview.input;

import dev.rebelcraft.j2hyperview.behaviours.atributes.ITrigger;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;

public class TextFieldTag extends ContainerTag<TextFieldTag> implements ITrigger<TextFieldTag> {
	public TextFieldTag(  ) {
		super( "text-field" );
	}
}
