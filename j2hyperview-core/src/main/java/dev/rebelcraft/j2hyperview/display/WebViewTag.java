package dev.rebelcraft.j2hyperview.display;

import dev.rebelcraft.j2hyperview.display.attributes.*;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.attributes.IId;

public class WebViewTag extends ContainerTag<WebViewTag> implements
		IUrl<WebViewTag>,
		IHtml<WebViewTag>,
		IActivityIndicatorColor<WebViewTag>,
		IInjectedJavaScript<WebViewTag>,
		IShowLoadingIndicator<WebViewTag>,
		IId<WebViewTag>
{
	public WebViewTag(  ) {
		super( "spinner" );
	}
}
