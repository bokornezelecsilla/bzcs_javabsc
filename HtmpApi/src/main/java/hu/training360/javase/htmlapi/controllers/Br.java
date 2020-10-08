package hu.training360.javase.htmlapi.controllers;

import hu.training360.javase.htmlapi.components.AbstractHtmlController;
import hu.training360.javase.htmlapi.components.AbstractHtmlTag;

public class Br extends AbstractHtmlController {

    public Br(String id, AbstractHtmlTag parentTag) {
        super(id, parentTag);
    }

    @Override
    public String getHtmlAsString() {
        return "<br/>";
    }
}
