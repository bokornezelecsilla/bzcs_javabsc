package hu.training360.javase.htmlapi;

import hu.training360.javase.htmlapi.containers.Html;
import hu.training360.javase.htmlapi.controllers.Button;

public class HtmlDocTest {

    Html root = new Html();

    Button button = new Button("1",  "", "Button", root);

    String html  = root.getHtmlAsString();

}
