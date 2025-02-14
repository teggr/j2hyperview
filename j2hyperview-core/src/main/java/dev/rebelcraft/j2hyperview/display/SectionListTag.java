package dev.rebelcraft.j2hyperview.display;

import dev.rebelcraft.j2hyperview.behaviours.atributes.IStandardBehaviours;
import dev.rebelcraft.j2hyperview.behaviours.atributes.ITrigger;
import dev.rebelcraft.j2hyperview.display.attributes.IKeyboardDismissMode;
import dev.rebelcraft.j2hyperview.display.attributes.IKeyboardShouldPersistTaps;
import dev.rebelcraft.j2hyperview.display.attributes.ISticky;
import dev.rebelcraft.j2hyperview.display.attributes.IStickySectionTitles;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.IHide;
import dev.rebelcraft.j2hyperview.tags.attributes.IId;
import dev.rebelcraft.j2hyperview.tags.attributes.IStyle;

public class SectionListTag extends ContainerTag<SectionListTag> implements
		IStandardBehaviours<SectionListTag>,
		IStyle<SectionListTag>,
		IId<SectionListTag>,
		IHide<SectionListTag>,
		IStickySectionTitles<SectionListTag>,
		IKeyboardDismissMode<SectionListTag>,
		IKeyboardShouldPersistTaps<SectionListTag>
{
	public SectionListTag(  ) {
		super( "section-list" );
	}
}
