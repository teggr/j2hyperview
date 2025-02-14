package dev.rebelcraft.j2hyperview.tags;


import dev.rebelcraft.j2hyperview.HyperviewConfig;
import dev.rebelcraft.j2hyperview.attributes.Attribute;
import dev.rebelcraft.j2hyperview.rendering.FlatHxml;
import dev.rebelcraft.j2hyperview.rendering.HxmlBuilder;
import dev.rebelcraft.j2hyperview.rendering.TagBuilder;

import java.io.IOException;

public class EmptyTag<T extends EmptyTag<T>> extends Tag<T> {

    public EmptyTag(String tagName) {
        super(tagName);
        if (tagName == null) {
            throw new IllegalArgumentException("Illegal tag name: null");
        }
        if ("".equals(tagName)) {
            throw new IllegalArgumentException("Illegal tag name: \"\"");
        }
    }

    @Override
    public <A extends Appendable> A render(HxmlBuilder<A> builder, Object model) throws IOException {
        TagBuilder attrs = builder.appendEmptyTag(getTagName());
        for (Attribute attr : getAttributes()) {
            attr.render(attrs, model);
        }
        attrs.completeTag();
        return builder.output();
    }

    @Override
    @Deprecated
    public void renderModel(Appendable writer, Object model) throws IOException {
        HxmlBuilder<?> builder = (writer instanceof HxmlBuilder)
                ? (HxmlBuilder<?>) writer
                : FlatHxml.into(writer, HyperviewConfig.global());

        render(builder, model);
    }

}
