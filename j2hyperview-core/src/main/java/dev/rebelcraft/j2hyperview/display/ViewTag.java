package dev.rebelcraft.j2hyperview.display;

import dev.rebelcraft.j2hyperview.behaviours.atributes.IStandardBehaviours;
import dev.rebelcraft.j2hyperview.display.attributes.*;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.IHide;
import dev.rebelcraft.j2hyperview.tags.attributes.IId;
import dev.rebelcraft.j2hyperview.tags.attributes.IStyle;

public class ViewTag extends ContainerTag<ViewTag> implements
		IStandardBehaviours<ViewTag>,
		ISafeArea<ViewTag>,
		IStyle<ViewTag>,
		IContentContainerStyle<ViewTag>,
		IScroll<ViewTag>,
		IScrollOrientation<ViewTag>,
		IScrollToInputOffset<ViewTag>,
		IShowsScrollIndicator<ViewTag>,
		IId<ViewTag>,
		IHide<ViewTag>,
		IAvoidKeyboard<ViewTag>,
		ISticky<ViewTag>,
		IKeyboardDismissMode<ViewTag>
{
	public ViewTag(  ) {
		super( "view" );
	}
}
