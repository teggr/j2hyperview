package dev.rebelcraft.j2hyperview.rendering;

import dev.rebelcraft.j2hyperview.HyperviewConfig;
import dev.rebelcraft.j2hyperview.utils.TextEscaper;

import java.io.IOException;

public class FlatHxml<T extends Appendable> implements HxmlBuilder<T> {

    /**
     * Returns an HxmlBuilder that will generate flat HTML using
     * Config defaults.
     *
     * @param out The Appendable to which HTML will be appended.
     * @param <T> The type of the Appendable to which HTML will be appended.
     * @return An HxmlBuilder for flat HTML.
     */
    public static final <T extends Appendable> FlatHxml<T> into(T out) {
        return new FlatHxml<>(out, HyperviewConfig.defaults());
    }

    /**
     * Returns an HxmlBuilder that will generate flat HTML using
     * the given Config.
     *
     * @param out    The Appendable to which HTML will be appended.
     * @param config The Config which will specify text escapement, tag closing, etc.
     * @param <T>    The type of the Appendable to which HTML will be appended.
     * @return An HxmlBuilder for flat HTML.
     */
    public static final <T extends Appendable> FlatHxml<T> into(T out, HyperviewConfig config) {
        return new FlatHxml<>(out, config);
    }

    /**
     * Returns an HxmlBuilder that will generate flat HTML in memory
     * using Config defaults.
     *
     * @return An HxmlBuilder for flat HTML.
     */
    public static final FlatHxml<StringBuilder> inMemory() {
        return into(new StringBuilder());
    }

    /**
     * Returns an HxmlBuilder that will generate flat HTML in memory
     * using the given Config.
     * @param config The Config which will specify text escapement, tag closing, etc.
     * @return An HxmlBuilder for flat HTML.
     */
    public static final FlatHxml<StringBuilder> inMemory(HyperviewConfig config) {
        return into(new StringBuilder(), config);
    }

    private final T out;
    private final TextEscaper textEscaper;
    private final TagBuilder enclosingElementAttributes;
    private final TagBuilder emptyElementAttributes;

    private FlatHxml(T out, HyperviewConfig config) {
        this.out = out;
        this.textEscaper = config.textEscaper();
        this.enclosingElementAttributes = new FlatHxml.FlatTagBuilder(false);
        this.emptyElementAttributes = new FlatHxml.FlatTagBuilder(config.closeEmptyTags());
    }

    public T output() {
        return out;
    }

    @Override
    @Deprecated
    public HxmlBuilder<T> append(CharSequence csq) throws IOException {
        out.append(csq);
        return this;
    }

    @Override
    @Deprecated
    public HxmlBuilder<T> append(CharSequence csq, int start, int end) throws IOException {
        out.append(csq, start, end);
        return this;
    }

    @Override
    @Deprecated
    public HxmlBuilder<T> append(char c) throws IOException {
        out.append(c);
        return this;
    }

    @Override
    public TagBuilder appendStartTag(String name) throws IOException {
        out.append("<").append(name);
        return enclosingElementAttributes;
    }

    @Override
    public HxmlBuilder<T> appendEndTag(String name) throws IOException {
        out.append("</").append(name).append(">");
        return this;
    }

    @Override
    public TagBuilder appendEmptyTag(String name) throws IOException {
        out.append("<").append(name);
        return emptyElementAttributes;
    }

    @Override
    public HxmlBuilder<T> appendEscapedText(String txt) throws IOException {
        out.append(textEscaper.escape(txt));
        return this;
    }

    @Override
    public HxmlBuilder<T> appendUnescapedText(String txt) throws IOException {
        out.append(txt);
        return this;
    }

    private class FlatTagBuilder implements TagBuilder {

        private final boolean closeTag;

        private FlatTagBuilder(boolean closeTag) {
            this.closeTag = closeTag;
        }

        @Override
        public TagBuilder appendAttribute(String name, String value) throws IOException {
            out.append(" ")
                    .append(name)
                    .append("=\"")
                    .append(textEscaper.escape(value))
                    .append("\"");
            return this;
        }

        @Override
        public TagBuilder appendBooleanAttribute(String name) throws IOException {
            out.append(" ").append(name);
            return this;
        }

        @Override
        public HxmlBuilder<T> completeTag() throws IOException {
            if (closeTag) {
                out.append("/");
            }
            out.append(">");

            return FlatHxml.this;
        }

        @Override
        @Deprecated
        public TagBuilder append(CharSequence csq) throws IOException {
            out.append(csq);
            return this;
        }

        @Override
        @Deprecated
        public TagBuilder append(CharSequence csq, int start, int end) throws IOException {
            out.append(csq, start, end);
            return this;
        }

        @Override
        @Deprecated
        public TagBuilder append(char c) throws IOException {
            out.append(c);
            return this;
        }
    }

}
