package dev.rebelcraft.j2hyperview;

import dev.rebelcraft.j2hyperview.utils.EscapeUtil;
import dev.rebelcraft.j2hyperview.utils.Indenter;
import dev.rebelcraft.j2hyperview.utils.TextEscaper;

import java.util.Collections;

public class HyperviewConfig {

    /**
     * Change this to configure text-escaping
     * For example, to disable escaping, do <code>{@code Config.textEscaper = text -> text;}</code>
     */
    public static TextEscaper textEscaper = EscapeUtil::escape;
    /**
     * Change this to configure enable/disable closing empty tags
     * The default is to NOT close them
     */
    public static boolean closeEmptyTags = false;
    private static String FOUR_SPACES = "    ";
    /**
     * Change this to configure indentation when rendering formatted html
     * The default is four spaces
     */
    public static Indenter indenter = (level, text) -> String.join("", Collections.nCopies(level, FOUR_SPACES)) + text;


    private TextEscaper _textEscaper;
    private boolean _closeEmptyTags;
    private Indenter _indenter;


    private HyperviewConfig(
            TextEscaper _textEscaper,
            boolean _closeEmptyTags,
            Indenter _indenter
    ) {
        this._textEscaper = _textEscaper;
        this._closeEmptyTags = _closeEmptyTags;
        this._indenter = _indenter;
    }

    /**
     * A copy constructor.
     *
     * @param original The Config to copy fields from.
     */
    private HyperviewConfig(HyperviewConfig original) {
        this._textEscaper = original._textEscaper;
        this._closeEmptyTags = original._closeEmptyTags;
        this._indenter = original._indenter;
    }

    public TextEscaper textEscaper() {
        return _textEscaper;
    }

    public boolean closeEmptyTags() {
        return _closeEmptyTags;
    }

    public Indenter indenter() {
        return _indenter;
    }

    public HyperviewConfig withTextEscaper(TextEscaper textEscaper){
        HyperviewConfig copy = new HyperviewConfig(this);
        copy._textEscaper = textEscaper;
        return copy;
    }

    public HyperviewConfig withEmptyTagsClosed(boolean closeEmptyTags){
        HyperviewConfig copy = new HyperviewConfig(this);
        copy._closeEmptyTags = closeEmptyTags;
        return copy;
    }

    public HyperviewConfig withIndenter(Indenter indenter){
        HyperviewConfig copy = new HyperviewConfig(this);
        copy._indenter = indenter;
        return copy;
    }

    private static final HyperviewConfig DEFAULTS = new HyperviewConfig(
            EscapeUtil::escape,
            false,
            (level, text) -> String.join("", Collections.nCopies(level, FOUR_SPACES)) + text
    );

    public static final HyperviewConfig defaults() {
        return DEFAULTS;
    }

    public static final HyperviewConfig global() {
        return new HyperviewConfig(
                textEscaper,
                closeEmptyTags,
                indenter
        );
    }

}
