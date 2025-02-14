package dev.rebelcraft.j2hyperview.display;

import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.IId;

public class ScreenTag extends ContainerTag<ScreenTag> implements
        IId<ScreenTag> {
    public ScreenTag() {
        super("screen");
    }
}
