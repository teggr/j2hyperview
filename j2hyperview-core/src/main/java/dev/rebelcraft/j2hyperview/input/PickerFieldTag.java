package dev.rebelcraft.j2hyperview.input;

import dev.rebelcraft.j2hyperview.behaviours.atributes.IStandardBehaviours;
import dev.rebelcraft.j2hyperview.input.attributes.*;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.IHide;
import dev.rebelcraft.j2hyperview.tags.attributes.IId;

public class PickerFieldTag extends ContainerTag<PickerFieldTag> implements
		IStandardBehaviours<PickerFieldTag>,
		IName<PickerFieldTag>,
		IValue<PickerFieldTag>,
		IPlaceholder<PickerFieldTag>,
		IDoneLabel<PickerFieldTag>,
		ICancelLabel<PickerFieldTag>,
		IFieldStyle<PickerFieldTag>,
		IFieldTextStyle<PickerFieldTag>,
		IModalStyle<PickerFieldTag>,
		IModalTextStyle<PickerFieldTag>,
		IModalAnimationDuration<PickerFieldTag>,
		IModalOverlayAnimationDuration<PickerFieldTag>,
		IModalDimissAnimationDuration<PickerFieldTag>,
		IModalDimissOverlayAnimationDuration<PickerFieldTag>,
		IId<PickerFieldTag>,
		IHide<PickerFieldTag>
{
	public PickerFieldTag(  ) {
		super( "picker-field" );
	}
}
