package dev.rebelcraft.j2hyperview.rendering;


import java.io.IOException;

public interface TagBuilder extends Appendable {

    TagBuilder appendAttribute(String name, String value) throws IOException;

    TagBuilder appendBooleanAttribute(String name) throws IOException;

    HxmlBuilder<? extends Appendable> completeTag() throws IOException;

}
