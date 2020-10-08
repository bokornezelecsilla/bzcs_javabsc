package hu.training360.javase.htmlapi.containers;

import hu.training360.javase.htmlapi.components.AbstractHtmlContainer;
import hu.training360.javase.htmlapi.components.AbstractHtmlTag;

public class Div extends AbstractHtmlContainer {

    public Div(String id, AbstractHtmlTag parentTag) {
        super(id, parentTag);
    }

    @Override
    public String getHtmlAsString() {
        StringBuilder ret = new StringBuilder();
        String stBe = this.behuz.substring(3);
        ret.append("<div>\n")
                .append(super.getHtmlAsString())
                .append(stBe + "</div>\n");
        return ret.toString();
    }
}
