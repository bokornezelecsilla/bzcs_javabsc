package hu.training360.javase.htmlapi.containers;

import hu.training360.javase.htmlapi.components.AbstractHtmlContainer;
import hu.training360.javase.htmlapi.components.AbstractHtmlTag;

public class Ol extends AbstractHtmlContainer {

    public Ol(String id, AbstractHtmlTag parentTag) {
        super(id, parentTag);
    }

    @Override
    public String getHtmlAsString() {
        StringBuilder ret = new StringBuilder();
        String stBe = this.behuz.substring(3);
        ret.append("<ol>\n")
                .append(super.getHtmlAsString())
                .append(stBe + "</ol>\n");
        return ret.toString();
    }
}
