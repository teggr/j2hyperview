package dev.rebelcraft.j2hyperview.input;

import dev.rebelcraft.j2hyperview.behaviours.atributes.IAction;
import dev.rebelcraft.j2hyperview.behaviours.atributes.IHref;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.ICSSStyle;

public class SelectSIngleTag extends ContainerTag<SelectSIngleTag> implements IHref<SelectSIngleTag>, IAction<SelectSIngleTag>, ICSSStyle<SelectSIngleTag> {
	public SelectSIngleTag(  ) {
		super( "style" );
	}
}
