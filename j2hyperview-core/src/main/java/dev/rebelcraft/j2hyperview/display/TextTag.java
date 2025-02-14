package dev.rebelcraft.j2hyperview.display;

import dev.rebelcraft.j2hyperview.behaviours.atributes.IStandardBehaviours;
import dev.rebelcraft.j2hyperview.display.attributes.IAdjustsFontSizeToFit;
import dev.rebelcraft.j2hyperview.display.attributes.INumberOfLines;
import dev.rebelcraft.j2hyperview.display.attributes.IPreformatted;
import dev.rebelcraft.j2hyperview.display.attributes.ISelectable;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.IHide;
import dev.rebelcraft.j2hyperview.tags.attributes.IId;
import dev.rebelcraft.j2hyperview.tags.attributes.IStyle;

public class TextTag extends ContainerTag<TextTag> implements
        IStandardBehaviours<TextTag>,
        IStyle<TextTag>,
        INumberOfLines<TextTag>,
        IId<TextTag>,
        IHide<TextTag>,
        ISelectable<TextTag>,
        IAdjustsFontSizeToFit<TextTag>,
        IPreformatted<TextTag>
{
    public TextTag() {
        super("text");
    }
}
