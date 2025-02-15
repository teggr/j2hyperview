package dev.rebelcraft.j2hyperview.style;

import dev.rebelcraft.j2hyperview.behaviours.atributes.IAction;
import dev.rebelcraft.j2hyperview.behaviours.atributes.IHref;
import dev.rebelcraft.j2hyperview.style.attributes.IFocused;
import dev.rebelcraft.j2hyperview.style.attributes.IPressed;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.ICSSStyle;
import dev.rebelcraft.j2hyperview.tags.attributes.ISelected;

public class ModifierTag extends ContainerTag<ModifierTag> implements
		IFocused<ModifierTag>,
		IPressed<ModifierTag>,
		ISelected<ModifierTag>
{
	public ModifierTag(  ) {
		super( "modifier" );
	}
}
