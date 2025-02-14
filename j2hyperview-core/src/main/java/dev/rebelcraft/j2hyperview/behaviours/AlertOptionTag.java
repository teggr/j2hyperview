package dev.rebelcraft.j2hyperview.behaviours;

import dev.rebelcraft.j2hyperview.behaviours.atributes.IAlertLabel;
import dev.rebelcraft.j2hyperview.behaviours.atributes.IStandardBehaviours;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.IStyle;

public class AlertOptionTag extends ContainerTag<AlertOptionTag> implements
        IStandardBehaviours<AlertOptionTag>,
        IAlertLabel<AlertOptionTag>,
        IStyle<AlertOptionTag> {

    public AlertOptionTag() {
        super("alert:option");
    }

}
