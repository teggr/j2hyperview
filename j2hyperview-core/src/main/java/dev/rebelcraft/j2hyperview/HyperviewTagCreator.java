package dev.rebelcraft.j2hyperview;

import dev.rebelcraft.j2hyperview.display.*;
import dev.rebelcraft.j2hyperview.style.StyleTag;
import dev.rebelcraft.j2hyperview.style.StylesTag;
import dev.rebelcraft.j2hyperview.tags.*;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HyperviewTagCreator {

	private HyperviewTagCreator() {};

	/**
	 * Generic if-expression to do if'ing inside method calls
	 *
	 * @param <T>       The derived generic parameter type
	 * @param condition the condition to if-on
	 * @param ifValue   the value to return if condition is true
	 * @return value if condition is true, null otherwise
	 */
	public static <T> T iff(boolean condition, T ifValue) {
		return condition ? ifValue : null;
	}

	/**
	 * Generic if-expression to if'ing inside method calls
	 *
	 * @param optional   The item that may be present
	 * @param ifFunction The function that will be called if that optional is present
	 * @param <T>        The derived generic parameter type
	 * @param <U>        The supplying generic parameter type
	 * @return transformed value if condition is true, null otherwise
	 */
	@SuppressWarnings("OptionalUsedAsFieldOrParameterType")
	public static <T, U> T iff(Optional<U> optional, Function<U, T> ifFunction) {
		if (Objects.nonNull(optional) && optional.isPresent()) {
			return optional.map(ifFunction).orElse(null);
		}
		return null;
	}

	/**
	 * Like {@link HyperviewTagCreator#iff}, but returns else-value instead of null
	 */
	public static <T> T iffElse(boolean condition, T ifValue, T elseValue) {
		return condition ? ifValue : elseValue;
	}

	/**
	 * Returns the HTML created by concatenating the input elements,
	 * separated by space, in encounter order.
	 * Also removes spaces before periods and commas.
	 *
	 * @param stringOrDomObjects the elements to join
	 * @return joined elements as HTML
	 */
	public static UnescapedText join(Object... stringOrDomObjects) {
		return HyperviewContentJoiner.join(" ", true, stringOrDomObjects);
	}

	/**
	 * Creates a group of HyperviewContent objects (that may be used with {@link #iff(boolean, Object)} or returned from a
	 * method call).
	 *
	 * @param contents the HyperviewContent elements
	 * @return HyperviewContent containing the given elements
	 */
	public static HyperviewContent each(HyperviewContent... contents) {
		return new ContainerTag<>(null).with(contents);
	}

	/**
	 * Creates a HyperviewContent object containing HTML elements from a stream.
	 * Intended usage: {@literal each(numbers.stream().map(n -> li(n.toString())))}
	 *
	 * @param stream the stream of HyperviewContent elements
	 * @return HyperviewContent containing elements from the stream
	 */
	public static HyperviewContent each(Stream<HyperviewContent> stream) {
		return new ContainerTag<>(null).with(stream);
	}

	/**
	 * Creates a HyperviewContent object containing HTML using a mapping function on a collection
	 * Intended usage: {@literal each(numbers, n -> li(n.toString()))}
	 *
	 * @param <T>        The derived generic parameter type
	 * @param collection the collection to iterate over, ex: a list of values "1, 2, 3"
	 * @param mapper     the mapping function, ex: {@literal "n -> li(n.toString())"}
	 * @return HyperviewContent containing mapped data {@literal (ex. docs: [li(1), li(2), li(3)])}
	 */
	public static <T> HyperviewContent each(Collection<T> collection, Function<? super T, HyperviewContent> mapper) {
		return tag(null).with(collection.stream().map(mapper));
	}

	/**
	 * Creates a HyperviewContent object containing HTML using a mapping BiFunction on a collection
	 * Intended usage: {@literal each(names, (index, name) -> li(index + " " + name))}
	 *
	 * @param <T>        The derived generic parameter type
	 * @param collection the collection to iterate over, ex: a list of values [ "Tom", "Dick", "Harry" ]
	 * @param mapper     the mapping BiFunction, ex: {@literal "(index, name) -> li(index + " " + name)"}
	 * @return HyperviewContent containing mapped data {@literal (ex. docs: [li(0 Tom), li(1 Dick), li(2 Harry)])}
	 */
	public static <T> HyperviewContent each(Collection<T> collection, BiFunction<Integer, ? super T, HyperviewContent> mapper) {
		ContainerTag<?> dom = tag(null);
		int i = 0;
		for(T t : collection){
			dom.with(mapper.apply(i++, t));
		}
		return dom;
	}

	public static <I, T> HyperviewContent each(final Map<I, T> map, final Function<Map.Entry<I, T>, HyperviewContent> mapper) {
		return each(map.entrySet().stream().map(mapper));
	}

	/**
	 * Creates a HyperviewContent object containing HTML using a mapping function on a map
	 * Intended usage: {@literal each(idsToNames, (id, name) -> li(id + " " + name))}
	 *
	 * @param <I>    The type of the keys
	 * @param <T>    The type of the values
	 * @param map    the map to iterate over, ex: a map of values { 1: "Tom", 2: "Dick", 3: "Harry" }
	 * @param mapper the mapping function, ex: {@literal "(id, name) -> li(id + " " + name)"}
	 * @return HyperviewContent containing mapped data {@literal (ex. docs: [li(1 Tom), li(2 Dick), li(3 Harry)])}
	 */
	public static <I, T> HyperviewContent each(final Map<I, T> map, final BiFunction<I, T, HyperviewContent> mapper) {
		return each(map.entrySet().stream().map(entry -> mapper.apply(entry.getKey(), entry.getValue())));
	}

	/**
	 * Filters a collection to a list, to be used with {@link HyperviewTagCreator#each}
	 * Intended usage: {@literal each(filter(numbers, n -> n % 2 == 0), n -> li(n.toString()))}
	 *
	 * @param <T>        The derived generic parameter type
	 * @param collection the collection to filter, ex: a list of values "1, 2, 3"
	 * @param filter     the filter predicate, {@literal ex: "n -> n % 2 == 0"}
	 * @return the filtered collection as a list (ex. docs: 2)
	 */
	public static <T> List<T> filter(Collection<T> collection, Predicate<? super T> filter) {
		return collection.stream().filter(filter).collect(Collectors.toList());
	}

	/**
	 * Wraps a String in an UnescapedText element
	 *
	 * @param html the input html
	 * @return the input html wrapped in an UnescapedText element
	 */
	public static UnescapedText rawHtml(String html) {
		return new UnescapedText(html);
	}

	/**
	 * Wraps a String in a Text element (does html-escaping)
	 *
	 * @param text the input string
	 * @return the input string, html-escaped
	 */
	public static Text textValue(String text) {
		return new Text(text);
	}

	//Special tags
	public static ContainerTag<? extends Tag<?>> tag(String tagName) {
		return new ContainerTag<>(tagName);
	}

	public static EmptyTag<? extends Tag<?>> emptyTag(String tagName) {
		return new EmptyTag<>(tagName);
	}

	public static Text fileAsEscapedString(String path) {
		return textValue(InlineStaticResource.getFileAsString(path));
	}

	public static UnescapedText fileAsString(String path) {
		return rawHtml(InlineStaticResource.getFileAsString(path));
	}

	public static StyleTag styleWithInlineFile(String path) {
		return (StyleTag) InlineStaticResource.get(path, InlineStaticResource.TargetFormat.CSS);
	}

	public static StyleTag styleWithInlineFile_min(String path) {
		return (StyleTag) InlineStaticResource.get(path, InlineStaticResource.TargetFormat.CSS_MIN);
	}

	public static DocTag doc() {
		return new DocTag();
	}

	public static DocTag doc( HyperviewContent... hc ) {
		return doc().with( hc );
	}

	public static ScreenTag screen() {
		return new ScreenTag();
	}

	public static ScreenTag screen( HyperviewContent... hc ) {
		return screen().with( hc );
	}

	public static BodyTag body() {
		return new BodyTag();
	}

	public static BodyTag body( HyperviewContent... hc ) {
		return body().with( hc );
	}

	public static TextTag text() {
		return new TextTag();
	}

	public static TextTag text(String text) {
		return new TextTag().withText(text);
	}

	public static TextTag text( HyperviewContent... hc ) {
		return text().with( hc );
	}

	public static ViewTag view() {
		return new ViewTag();
	}

	public static ViewTag view( HyperviewContent... hc ) {
		return view().with( hc );
	}

	public static StyleTag style() { return new StyleTag(); }

	public static StylesTag styles() { return new StylesTag(); }

	public static StylesTag styles( HyperviewContent... hc ) { return new StylesTag().with( hc ); }

}
