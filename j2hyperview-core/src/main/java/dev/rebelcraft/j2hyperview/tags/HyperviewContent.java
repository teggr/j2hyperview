package dev.rebelcraft.j2hyperview.tags;

public abstract class HyperviewContent implements Renderable {
	public HyperviewContent() {}
	public String toString() { return this.render(); }
}
