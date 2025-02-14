package dev.rebelcraft.j2hyperview.style;

import dev.rebelcraft.j2hyperview.behaviours.atributes.IAction;
import dev.rebelcraft.j2hyperview.behaviours.atributes.IHref;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;

public class StylesTag extends ContainerTag<StylesTag> implements IHref<StylesTag>, IAction<StylesTag> {
	public StylesTag(  ) {
		super( "styles" );
	}
}
