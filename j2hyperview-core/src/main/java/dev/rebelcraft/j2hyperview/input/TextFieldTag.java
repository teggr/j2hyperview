package dev.rebelcraft.j2hyperview.input;

import dev.rebelcraft.j2hyperview.behaviours.atributes.IStandardBehaviours;
import dev.rebelcraft.j2hyperview.behaviours.atributes.ITrigger;
import dev.rebelcraft.j2hyperview.display.attributes.IKey;
import dev.rebelcraft.j2hyperview.input.attributes.*;
import dev.rebelcraft.j2hyperview.tags.ContainerTag;
import dev.rebelcraft.j2hyperview.tags.Text;
import dev.rebelcraft.j2hyperview.tags.attributes.IHide;
import dev.rebelcraft.j2hyperview.tags.attributes.IId;
import dev.rebelcraft.j2hyperview.tags.attributes.IStyle;

import java.awt.*;

public class TextFieldTag extends ContainerTag<TextFieldTag> implements
		IStandardBehaviours<TextFieldTag>,
		IName<TextFieldTag>,
		IValue<TextFieldTag>,
		IPlaceholder<TextFieldTag>,
		IPlaceholderTextColor<TextFieldTag>,
		ISelectionColor<TextFieldTag>,
		ISelectionHandleColor<TextFieldTag>,
		ICursorColor<TextFieldTag>,
		IMultiline<TextFieldTag>,
		IKeyboardType<TextFieldTag>,
		IMask<TextFieldTag>,
		IStyle<TextFieldTag>,
		IId<TextFieldTag>,
		IHide<TextFieldTag>,
		IAutoFocus<TextFieldTag>,
		ISecureText<TextFieldTag>,
		ITextContentType<TextFieldTag>
{
	public TextFieldTag(  ) {
		super( "text-field" );
	}
}
