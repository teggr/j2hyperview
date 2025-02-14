package dev.rebelcraft.j2hyperview.tags;

import dev.rebelcraft.j2hyperview.attributes.Attribute;

import java.util.ArrayList;

public abstract class Tag<T extends Tag<T>> extends HyperviewContent implements IInstance<T> {

	private final String tagName;
	private final ArrayList<Attribute> attributes;

	protected Tag(  String tagName ) {
		this.tagName = tagName;
		this.attributes = new ArrayList<>();
	}

	public String getTagName() {
		return tagName;
	}

	public boolean hasTagName() {
		return tagName != null && !tagName.isEmpty();
	}

	protected ArrayList<Attribute> getAttributes() {
		return attributes;
	}

	boolean setAttribute(String name, String value) {
		if (value == null) {
			return attributes.add(new Attribute(name));
		}
		for ( Attribute attribute : attributes) {
			if (attribute.getName().equals(name)) {
				attribute.setValue(value); // update with new value
				return true;
			}
		}
		return attributes.add(new Attribute(name, value));
	}

	public T attr(String attribute, Object value) {
		setAttribute(attribute, value == null ? null : String.valueOf(value));
		return self();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Tag)) {
			return false;
		}
		return ((Tag<?>) obj).render().equals(this.render());
	}

}
