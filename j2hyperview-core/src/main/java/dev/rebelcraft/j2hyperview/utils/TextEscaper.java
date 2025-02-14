package dev.rebelcraft.j2hyperview.utils;

@FunctionalInterface
public interface TextEscaper {
    String escape(String text);
}