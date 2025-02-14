package dev.rebelcraft.hv.app;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static dev.rebelcraft.j2hyperview.HyperviewTagCreator.*;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping(produces = {MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public String getIndex() {

        return doc(
                screen(
                        styles(
                                style().withId("Body").withBackgroundColor("white").withFlex("1").withPadding("48"),
                                style().withId("Label").withFontSize("18").withLineHeight("24"),
                                style().withId("Label--Link").withColor("blue").withFontSize("18")
                        ),
                        body().withStyle("Body")
                                .with(
                                        text("This is screen 1.").withStyle("Label"),
                                        text("Click me").withStyle("Label Label--Link").withHref("http://locahost:8081/screen2")
                                )
                )
        ).render();

    }

    @GetMapping(value = "/screen2", produces = {MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public String getScreen2() {

        return doc(
                screen(
                        styles(
                                style().withId("Body").withBackgroundColor("white").withFlex("1").withPadding("48"),
                                style().withId("Label").withFontSize("18").withLineHeight("24"),
                                style().withId("Label--Link").withColor("blue").withFontSize("18")

                        ),
                        body().withStyle("Body")
                                .with(
                                        text("This is screen 2.").withStyle("Label")
                                )
                )
        ).render();

    }

}
