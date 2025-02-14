package dev.rebelcraft.j2hyperview.behaviours;

import dev.rebelcraft.j2hyperview.behaviours.atributes.*;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;

import java.awt.*;

public class ShareTag extends ContainerTag<ShareTag> implements
        IStandardBehaviours<ShareTag>,
        IShareDialogTitle<ShareTag>,
        IShareSubject<ShareTag>,
        IShareMessage<ShareTag>,
        IShareUrl<ShareTag>,
        IShareTitle<ShareTag> {

    public ShareTag() {
        super("behaviour");
        attr("xmlns:share", "https://hyperview.org/share");
        attr("action", "share");
    }

}
