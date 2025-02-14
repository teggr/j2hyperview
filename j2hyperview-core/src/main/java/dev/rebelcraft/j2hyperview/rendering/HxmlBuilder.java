package dev.rebelcraft.j2hyperview.rendering;

import java.io.IOException;

public interface HxmlBuilder<T extends Appendable> extends Appendable {

    TagBuilder appendStartTag(String name) throws IOException;

    HxmlBuilder<T> appendEndTag(String name) throws IOException;

    TagBuilder appendEmptyTag(String name) throws IOException;

    HxmlBuilder<T> appendEscapedText(String txt) throws IOException;

    HxmlBuilder<T> appendUnescapedText(String txt) throws IOException;

    T output();
    
}
