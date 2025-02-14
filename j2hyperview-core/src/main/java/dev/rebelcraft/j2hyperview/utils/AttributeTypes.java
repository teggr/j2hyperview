package dev.rebelcraft.j2hyperview.utils;

public class AttributeTypes {

    public static <T extends Enum> String name(T anEnum) {

        String name = anEnum.name();
        if(name.endsWith("_")) {
            name = name.substring(0, name.length()-1);
        }
        return name.replace("_", "-");

    }

}
