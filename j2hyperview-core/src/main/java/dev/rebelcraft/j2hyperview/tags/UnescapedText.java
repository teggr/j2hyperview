package dev.rebelcraft.j2hyperview.tags;


import dev.rebelcraft.j2hyperview.HyperviewConfig;
import dev.rebelcraft.j2hyperview.rendering.FlatHxml;
import dev.rebelcraft.j2hyperview.rendering.HxmlBuilder;

import java.io.IOException;

public class UnescapedText extends HyperviewContent {

    private final String text;

    public UnescapedText(String text) {
        this.text = text;
    }

    @Override
    public <T extends Appendable> T render(HxmlBuilder<T> builder, Object model) throws IOException {
        builder.appendUnescapedText(String.valueOf(text));
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

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof UnescapedText)) {
            return false;
        }
        return ((UnescapedText) obj).render().equals(this.render());
    }

}
