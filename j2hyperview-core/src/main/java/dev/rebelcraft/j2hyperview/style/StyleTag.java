package dev.rebelcraft.j2hyperview.style;

import dev.rebelcraft.j2hyperview.behaviours.atributes.IAction;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.ICSSStyle;
import dev.rebelcraft.j2hyperview.behaviours.atributes.IHref;

public class StyleTag extends ContainerTag<StyleTag> implements IHref<StyleTag>, IAction<StyleTag>, ICSSStyle<StyleTag> {
	public StyleTag(  ) {
		super( "style" );
	}
}
