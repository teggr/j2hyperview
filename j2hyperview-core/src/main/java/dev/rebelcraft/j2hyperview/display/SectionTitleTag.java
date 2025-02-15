package dev.rebelcraft.j2hyperview.display;

import dev.rebelcraft.j2hyperview.behaviours.atributes.IStandardBehaviours;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.IHide;
import dev.rebelcraft.j2hyperview.tags.attributes.IId;
import dev.rebelcraft.j2hyperview.tags.attributes.IStyle;

public class SectionTitleTag extends ContainerTag<SectionTitleTag> implements
		IStandardBehaviours<SectionTitleTag>,
		IStyle<SectionTitleTag>,
		IId<SectionTitleTag>,
		IHide<SectionTitleTag>
{
	public SectionTitleTag(  ) {
		super( "section-title" );
	}
}
