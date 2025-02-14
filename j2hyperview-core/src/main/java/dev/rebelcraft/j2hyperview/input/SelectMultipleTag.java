package dev.rebelcraft.j2hyperview.input;

import dev.rebelcraft.j2hyperview.behaviours.atributes.IAction;
import dev.rebelcraft.j2hyperview.behaviours.atributes.IHref;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.ICSSStyle;

public class SelectMultipleTag extends ContainerTag<SelectMultipleTag> implements IHref<SelectMultipleTag>, IAction<SelectMultipleTag>, ICSSStyle<SelectMultipleTag> {
	public SelectMultipleTag(  ) {
		super( "style" );
	}
}
