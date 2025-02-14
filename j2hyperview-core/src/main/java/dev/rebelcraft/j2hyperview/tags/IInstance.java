package dev.rebelcraft.j2hyperview.tags;

public interface IInstance<T> {
	@SuppressWarnings("unchecked")
	default T self() {
		return (T) this;
	}
}
