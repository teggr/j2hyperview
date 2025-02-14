package dev.rebelcraft.j2hyperview.display;

import dev.rebelcraft.j2hyperview.behaviours.atributes.IStandardBehaviours;
import dev.rebelcraft.j2hyperview.behaviours.atributes.ITrigger;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.IHide;
import dev.rebelcraft.j2hyperview.tags.attributes.IId;
import dev.rebelcraft.j2hyperview.tags.attributes.ISource;
import dev.rebelcraft.j2hyperview.tags.attributes.IStyle;

public class ImageTag extends ContainerTag<ImageTag> implements
		IStandardBehaviours<ImageTag>,
		ISource<ImageTag>,
		IStyle<ImageTag>,
		IId<ImageTag>,
		IHide<ImageTag>
{
	public ImageTag(  ) {
		super( "image" );
	}
}
