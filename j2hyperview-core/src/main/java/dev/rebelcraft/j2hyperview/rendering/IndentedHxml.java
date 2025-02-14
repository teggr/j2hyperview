package dev.rebelcraft.j2hyperview.rendering;

import dev.rebelcraft.j2hyperview.HyperviewConfig;
import dev.rebelcraft.j2hyperview.utils.Indenter;
import dev.rebelcraft.j2hyperview.utils.TextEscaper;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class IndentedHxml<T extends Appendable> implements HxmlBuilder<T> {


    /**
     * Returns an HxmlBuilder that will generate indented HTML using
     * HyperviewConfig defaults.
     *
     * @param out The Appendable to which HTML will be appended.
     * @param <T> The type of the Appendable to which HTML will be appended.
     * @return An HxmlBuilder for indented HTML.
     */
    public static final <T extends Appendable> IndentedHxml<T> into(T out) {
        return new IndentedHxml<>(out, HyperviewConfig.defaults());
    }

    /**
     * Returns an HxmlBuilder that will generate indented HTML using
     * the given HyperviewConfig.
     *
     * @param out    The Appendable to which HTML will be appended.
     * @param config The HyperviewConfig which will specify indentation, text escapement, tag closing, etc.
     * @param <T>    The type of the Appendable to which HTML will be appended.
     * @return An HxmlBuilder for indented HTML.
     */
    public static final <T extends Appendable> IndentedHxml<T> into(T out, HyperviewConfig config) {
        return new IndentedHxml<>(out, config);
    }

    /**
     * Returns an HxmlBuilder that will generate indented HTML in memory using
     * Config defaults.
     *
     * @return An HxmlBuilder for indented HTML.
     */
    public static final IndentedHxml<StringBuilder> inMemory() {
        return into(new StringBuilder());
    }

    /**
     * Returns an HxmlBuilder that will generate indented HTML in memory using
     * the given HyperviewConfig.
     *
     * @param config The HyperviewConfig which will specify indentation, text escapement, tag closing, etc.
     * @return An HxmlBuilder for indented HTML.
     */
    public static final IndentedHxml<StringBuilder> inMemory(HyperviewConfig config) {
        return into(new StringBuilder(), config);
    }

    private final T out;
    private final Indenter indenter;
    private final TextEscaper textEscaper;
    private final TagBuilder enclosingElementAttributes;
    private final TagBuilder emptyElementAttributes;

    // Dealing with preformatted elements (pre and textarea) requires
    // that we know what our parent elements are.  To do that we use
    // a stack; adding items as start tags are created, and removing them
    // as those tags are closed.  Determining whether or not we are
    // currently rendering into a preformatted element is as simple as
    // asking if any tags on the stack match a preformatted element name.
    private final Deque<String> trace = new ArrayDeque<>();

    private IndentedHxml(T out, HyperviewConfig config) {
        this.out = out;
        this.indenter = config.indenter();
        this.textEscaper = config.textEscaper();
        this.enclosingElementAttributes = new IndentedHxml.IndentedTagBuilder(false);
        this.emptyElementAttributes = new IndentedHxml.IndentedTagBuilder(config.closeEmptyTags());
    }

    private boolean isContentSelfFormatting() {
        return trace.contains("pre") || trace.contains("textarea");
    }

    private int lvl() {
        return trace.size();
    }

    @Override
    public TagBuilder appendStartTag(String name) throws IOException {
        if (!isContentSelfFormatting()) {
            out.append(indenter.indent(lvl(), ""));
        }

        trace.push(name);

        out.append("<").append(name);
        return enclosingElementAttributes;
    }

    @Override
    public HxmlBuilder<T> appendEndTag(String name) throws IOException {
        if (!name.equals(trace.peek())) {
            throw new RuntimeException("Incorrect element closed: " + name + ".  Expected: " + trace.peek());
        }

        if (!isContentSelfFormatting()) {
            trace.pop();
            out.append(indenter.indent(lvl(), ""));
        } else {
            trace.pop();
        }

        out.append("</").append(name).append(">");

        if (!isContentSelfFormatting()) {
            out.append("\n");
        }

        return this;
    }

    @Override
    public TagBuilder appendEmptyTag(String name) throws IOException {
        if (!isContentSelfFormatting()) {
            out.append(indenter.indent(lvl(), ""));
        }
        out.append("<").append(name);
        return emptyElementAttributes;
    }

    private void appendLines(String txt) throws IOException {
        if (!isContentSelfFormatting()) {
            String[] lines = txt.split("\n");
            for (String line : lines) {
                out.append(indenter.indent(lvl(), line)).append("\n");
            }
        } else {
            out.append(txt);
        }
    }

    @Override
    public HxmlBuilder<T> appendEscapedText(String txt) throws IOException {
        appendLines(textEscaper.escape(txt));
        return this;
    }

    @Override
    public HxmlBuilder<T> appendUnescapedText(String txt) throws IOException {
        appendLines(txt);
        return this;
    }

    @Override
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


    private class IndentedTagBuilder implements TagBuilder {

        private final boolean closeTag;

        private IndentedTagBuilder(boolean closeTag) {
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

            if (!isContentSelfFormatting()) {
                out.append("\n");
            }

            return IndentedHxml.this;
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
