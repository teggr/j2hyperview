package dev.rebelcraft.j2hyperview.input;

import dev.rebelcraft.j2hyperview.input.attributes.*;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.IHide;
import dev.rebelcraft.j2hyperview.tags.attributes.IId;

public class DateFieldTag extends ContainerTag<DateFieldTag> implements
		IName<DateFieldTag>,
		ILabelFormat<DateFieldTag>,
		IMode<DateFieldTag>,
		IValue<DateFieldTag>,
		IPlaceholder<DateFieldTag>,
		IMin<DateFieldTag>,
		IMax<DateFieldTag>,
		IFieldStyle<DateFieldTag>,
		IFieldTextStyle<DateFieldTag>,
		IModalStyle<DateFieldTag>,
		IModalOverlayStyle<DateFieldTag>,
		IModalTextStyle<DateFieldTag>,
		IModalAnimationDuration<DateFieldTag>,
		IModalOverlayAnimationDuration<DateFieldTag>,
		IModalDimissAnimationDuration<DateFieldTag>,
		IModalDimissOverlayAnimationDuration<DateFieldTag>,
		IId<DateFieldTag>,
		IHide<DateFieldTag>
{
	public DateFieldTag(  ) {
		super( "date-field" );
	}
}
