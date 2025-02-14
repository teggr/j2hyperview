package dev.rebelcraft.j2hyperview.display;

import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.IHide;
import dev.rebelcraft.j2hyperview.tags.attributes.IId;

public class SectionTag extends ContainerTag<SectionTag> implements
		IId<SectionTag>,
		IHide<SectionTag>
{
	public SectionTag(  ) {
		super( "section" );
	}
}
