package hu.training360.javase.htmlapi.containers;

import hu.training360.javase.htmlapi.components.AbstractHtmlContainer;
import hu.training360.javase.htmlapi.components.AbstractHtmlTag;

public class Html extends AbstractHtmlContainer {

    public Html() {
        super(null);
    }

    public String getHtml()
    {
        StringBuilder ret = new StringBuilder();
                ret.append("<!DOCTYPE html>\n")
                .append("<html>\n")
                .append("<body>\n")
                .append(getHtmlAsString())
                .append("</body>\n")
                .append("</html>");
        return ret.toString();

    }

}
