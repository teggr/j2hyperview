package dev.rebelcraft.j2hyperview.behaviours;

import dev.rebelcraft.j2hyperview.behaviours.atributes.*;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;

public class AlertTag extends ContainerTag<AlertTag> implements
        IStandardBehaviours<AlertTag>,
        IAlertTitle<AlertTag>,
        IAlertMessage<AlertTag> {

    public AlertTag() {
        super("behaviour");
        attr("xmlns:alert", "https://hyperview.org/hyperview-alert");
        attr("action", "alert");
    }

}
