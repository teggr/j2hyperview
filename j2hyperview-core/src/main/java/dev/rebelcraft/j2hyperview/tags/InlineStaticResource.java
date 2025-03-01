package dev.rebelcraft.j2hyperview.tags;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static dev.rebelcraft.j2hyperview.HyperviewTagCreator.rawHtml;
import static dev.rebelcraft.j2hyperview.HyperviewTagCreator.style;

public class InlineStaticResource {

    public static ContainerTag<? extends Tag<?>> get(String path, InlineStaticResource.TargetFormat format) {
        String fileString = getFileAsString(path);
        switch (format) {
//            case CSS_MIN:
//                return style().with(rawHtml(Config.cssMinifier.minify(fileString)));
//            case JS_MIN:
//                return script().with(rawHtml(Config.jsMinifier.minify((fileString))));
            case CSS:
                return style().with(rawHtml(fileString));
//            case JS:
//                return script().with(rawHtml(fileString));
            default:
                throw new RuntimeException("Invalid target format");
        }
    }

    public static String getFileAsString(String path) {
        try {
            return streamToString(InlineStaticResource.class.getResourceAsStream(path));
        } catch (Exception expected) { // we don't ask users to specify classpath or file-system
            try {
                return streamToString(new FileInputStream(path));
            } catch (Exception exception) {
                throw new RuntimeException("Couldn't find file with path='" + path + "'");
            }
        }
    }

    private static String streamToString(InputStream inputStream) {
        Scanner s = new Scanner(inputStream).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }

    public enum TargetFormat {CSS_MIN, CSS, JS_MIN, JS}

}
