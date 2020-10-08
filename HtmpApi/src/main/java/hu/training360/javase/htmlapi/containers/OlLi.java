package hu.training360.javase.htmlapi.containers;

import hu.training360.javase.htmlapi.components.AbstractHtmlContainer;
import hu.training360.javase.htmlapi.components.AbstractHtmlTag;

public class OlLi extends AbstractHtmlContainer {
    private String liText;

    public OlLi(String id, String liText, AbstractHtmlTag parentTag) {
        super(id, parentTag);
        this.liText=liText;
    }

    @Override
    public String getHtmlAsString() {
        StringBuilder ret = new StringBuilder();
        String stBe = this.behuz.substring(3);
        ret.append("<li>")
                .append(liText + "\n")
                .append(super.getHtmlAsString())
;
        return ret.toString();
    }
}
