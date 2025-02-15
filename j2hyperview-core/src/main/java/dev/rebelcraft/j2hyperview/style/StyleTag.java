package dev.rebelcraft.j2hyperview.style;

import dev.rebelcraft.j2hyperview.style.attributes.layout.*;
import dev.rebelcraft.j2hyperview.style.attributes.text.*;
import dev.rebelcraft.j2hyperview.style.attributes.view.*;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.IId;

public class StyleTag extends ContainerTag<StyleTag> implements
		IId<StyleTag>,
		IAlignContent<StyleTag>,
		IAlignItems<StyleTag>,
		IAlignSelf<StyleTag>,
		IAspectRatio<StyleTag>,
		IBorderBottomWidth<StyleTag>,
		IBorderLeftWidth<StyleTag>,
		IBorderRightWidth<StyleTag>,
		IBorderTopWidth<StyleTag>,
		IBorderWidth<StyleTag>,
		IBottom<StyleTag>,
		IDisplay<StyleTag>,
		IFlex<StyleTag>,
		IFlexBasis<StyleTag>,
		IFlexDirection<StyleTag>,
		IFlexGrow<StyleTag>,
		IFlexShrink<StyleTag>,
		IFlexWrap<StyleTag>,
		IHeight<StyleTag>,
		IJustifyContent<StyleTag>,
		ILeft<StyleTag>,
		IMargin<StyleTag>,
		IMarginBottom<StyleTag>,
		IMarginHorizontal<StyleTag>,
		IMarginLeft<StyleTag>,
		IMarginRight<StyleTag>,
		IMarginTop<StyleTag>,
		IMarginVertical<StyleTag>,
		IMaxHeight<StyleTag>,
		IMaxWidth<StyleTag>,
		IMinHeight<StyleTag>,
		IMinWidth<StyleTag>,
		IOverflow<StyleTag>,
		IPadding<StyleTag>,
		IPaddingBottom<StyleTag>,
		IPaddingHorizontal<StyleTag>,
		IPaddingLeft<StyleTag>,
		IPaddingRight<StyleTag>,
		IPaddingTop<StyleTag>,
		IPaddingVertical<StyleTag>,
		IPosition<StyleTag>,
		IRight<StyleTag>,
		ITop<StyleTag>,
		IWidth<StyleTag>,
		IZIndex<StyleTag>,
		IBackgroundColor<StyleTag>,
		IBorderBottomColor<StyleTag>,
		IBorderBottomLeftRadius<StyleTag>,
		IBorderBottomRightRadius<StyleTag>,
		IBorderColor<StyleTag>,
		IBorderLeftColor<StyleTag>,
		IBorderRadius<StyleTag>,
		IBorderRightColor<StyleTag>,
		IBorderStyle<StyleTag>,
		IBorderTopColor<StyleTag>,
		IBorderTopLeftRadius<StyleTag>,
		IBorderTopRightRadius<StyleTag>,
		IElevation<StyleTag>,
		IOpacity<StyleTag>,
		IShadowColor<StyleTag>,
		IShadowOffsetX<StyleTag>,
		IShadowOffsetY<StyleTag>,
		IShadowOpacity<StyleTag>,
		IShadowRadius<StyleTag>,
		IColor<StyleTag>,
		IFontFamily<StyleTag>,
		IFontSize<StyleTag>,
		IFontStyle<StyleTag>,
		IFontWeight<StyleTag>,
		ILineHeight<StyleTag>,
		ITextAlign<StyleTag>,
		ITextShadowColor<StyleTag>,
		ITextShadowRadius<StyleTag>
{
	public StyleTag(  ) {
		super( "style" );
	}
}
