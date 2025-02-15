package dev.rebelcraft.j2hyperview.input;

import dev.rebelcraft.j2hyperview.behaviours.atributes.ITrigger;
import dev.rebelcraft.j2hyperview.display.attributes.IScroll;
import dev.rebelcraft.j2hyperview.display.attributes.IScrollOrientation;
import dev.rebelcraft.j2hyperview.display.attributes.IShowsScrollIndicator;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.IHide;
import dev.rebelcraft.j2hyperview.tags.attributes.IId;
import dev.rebelcraft.j2hyperview.tags.attributes.IStyle;

public class FormTag extends ContainerTag<FormTag> implements
		IStyle<FormTag>,
		IId<FormTag>,
		IHide<FormTag>,
		IScroll<FormTag>,
		IScrollOrientation<FormTag>,
		IShowsScrollIndicator<FormTag>
{
	public FormTag(  ) {
		super( "form" );
	}
}
