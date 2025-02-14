package dev.rebelcraft.j2hyperview.display;

import dev.rebelcraft.j2hyperview.tags.ContainerTag;

public final class DocTag extends ContainerTag<DocTag> {
	public DocTag() {
		super( "doc" );
		attr( "xmlns", "https://hyperview.org/hyperview" );
	}
}
