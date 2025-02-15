package dev.rebelcraft.j2hyperview.input;

import dev.rebelcraft.j2hyperview.behaviours.atributes.IAction;
import dev.rebelcraft.j2hyperview.behaviours.atributes.IHref;
import dev.rebelcraft.j2hyperview.input.attributes.ILabel;
import dev.rebelcraft.j2hyperview.input.attributes.IValue;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.IModal;
import dev.rebelcraft.j2hyperview.tags.attributes.ISelected;

public class PickerItemTag extends ContainerTag<PickerItemTag> implements
		ILabel<PickerItemTag>,
		IValue<PickerItemTag>
{
	public PickerItemTag(  ) {
		super( "picker-item" );
	}
}
