package dev.rebelcraft.j2hyperview.style;

import dev.rebelcraft.j2hyperview.behaviours.atributes.IAction;
import dev.rebelcraft.j2hyperview.behaviours.atributes.IHref;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.ICSSStyle;

public class ModifierTag extends ContainerTag<ModifierTag> implements IHref<ModifierTag>, IAction<ModifierTag>, ICSSStyle<ModifierTag> {
	public ModifierTag(  ) {
		super( "style" );
	}
}
