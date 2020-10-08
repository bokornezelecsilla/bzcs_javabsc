package hu.training360.javase.htmlapi.controllers;

import hu.training360.javase.htmlapi.components.AbstractHtmlContainer;
import hu.training360.javase.htmlapi.components.AbstractHtmlController;

public class Button extends AbstractHtmlController {
    private String onClick;
    private final String label;

    public Button(String id, String onClick, String label, AbstractHtmlContainer parent) {
        super(id, parent);
        this.label = label;
        this.onClick = onClick;
    }

    public String getOnClick() {
        return onClick;
    }

    public String getLabel() {
        return label;
    }

    public void setOnClick(String onClick) {
        this.onClick = onClick;
    }

    @Override
    public String getHtmlAsString() {
        return "<button type=\"button\" onclick=\""+onClick+"\">"+label+"</button>\n";
    }
}
