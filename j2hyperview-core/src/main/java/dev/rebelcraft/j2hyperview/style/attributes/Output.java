package dev.rebelcraft.j2hyperview.style.attributes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

public class Output {

    public static final String[] Layout = {

            "aspectRatio",
            "alignContent",
            "alignItems",
            "alignSelf",
            "borderBottomWidth",
            "borderLeftWidth",
            "borderRightWidth",
            "borderTopWidth",
            "borderWidth",
            "bottom",
            "display",
            "flex",
            "flexBasis",
            "flexDirection",
            "flexGrow",
            "flexShrink",
            "flexWrap",
            "height",
            "justifyContent",
            "left",
            "margin",
            "marginBottom",
            "marginHorizontal",
            "marginLeft",
            "marginRight",
            "marginTop",
            "marginVertical",
            "maxHeight",
            "maxWidth",
            "minHeight",
            "minWidth",
            "overflow",
            "padding",
            "paddingBottom",
            "paddingHorizontal",
            "paddingLeft",
            "paddingRight",
            "paddingTop",
            "paddingVertical",
            "position",
            "right",
            "top",
            "width",
            "zIndex",
    };

    public static final String[] View  = {

            "borderRightColor",
            "borderBottomColor",
            "borderBottomLeftRadius",
            "borderBottomRightRadius",
            "borderColor",
            "borderLeftColor",
            "borderRadius",
            "backgroundColor",
            "borderStyle",
            "borderTopColor",
            "borderTopLeftRadius",
            "borderTopRightRadius",
            "elevation",
            "opacity",
            "shadowColor",
            "shadowOffsetX",
            "shadowOffsetY",
            "shadowOpacity",
            "shadowRadius"
    };


    public static final String[] Text = {

            "color",
            "fontSize",
            "fontStyle",
            "fontWeight",
            "lineHeight",
            "textAlign",
            "textShadowColor",
            "fontFamily",
            "textShadowRadius"
    };

    public static void main(String[] args) throws IOException {

        Stream.of(Text)
                .forEach( value -> {
                    String packageName = "dev.rebelcraft.j2hyperview.style.attributes.text";
                    String capitalizedValue = value.substring(0,1).toUpperCase() + value.substring(1);
                    String className = "I" + capitalizedValue;

                    String template = """
                package %s;
                
                import dev.rebelcraft.j2hyperview.tags.IInstance;
                import dev.rebelcraft.j2hyperview.tags.Tag;
                
                public interface %s<T extends Tag<T>> extends IInstance<T> {
                
                	default T with%s(final String %s_) {
                		return self().attr("%s", %s_);
                	}
                
                	default T withCond%s(final boolean enable, final String %s_) {
                		if (enable) {
                			self().attr("%s", %s_);
                		}
                		return self();
                	}
                
                }
                """;

                    String output = template.formatted( packageName, className, capitalizedValue, value, value, value, capitalizedValue, value, value, value );

                    // System.out.println(output);

                    File file = new File( "j2hyperview-core/src/main/java/" + packageName.replaceAll("\\.", "/") + "/" + className + ".java");

                    Path path = file.getAbsoluteFile().toPath();

                    System.out.println(path);

                    try {
                        Files.write(path, output.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });



    }

}
