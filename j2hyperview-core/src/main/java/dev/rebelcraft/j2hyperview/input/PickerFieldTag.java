package dev.rebelcraft.j2hyperview.input;

import dev.rebelcraft.j2hyperview.behaviours.atributes.IAction;
import dev.rebelcraft.j2hyperview.behaviours.atributes.IHref;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.IType;

public class PickerFieldTag extends ContainerTag<PickerFieldTag> implements IHref<PickerFieldTag>, IAction<PickerFieldTag>,
		IType<PickerFieldTag> {
	public PickerFieldTag(  ) {
		super( "navigator" );
	}
}
