package dev.rebelcraft.j2hyperview.input;

import dev.rebelcraft.j2hyperview.behaviours.atributes.IAction;
import dev.rebelcraft.j2hyperview.behaviours.atributes.IHref;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.ICSSStyle;

public class DateFieldTag extends ContainerTag<DateFieldTag> implements IHref<DateFieldTag>, IAction<DateFieldTag>, ICSSStyle<DateFieldTag> {
	public DateFieldTag(  ) {
		super( "style" );
	}
}
