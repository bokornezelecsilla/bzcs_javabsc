package hu.training360.javase.htmlapi.components;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractHtmlContainer extends AbstractHtmlTag {

    protected List<HtmlInterface> childTags = new ArrayList<>();

    public AbstractHtmlContainer(String id) {
        super(id);
    }

    public AbstractHtmlContainer(String id, AbstractHtmlTag parentTag) {
        super(id, parentTag);
    }


    public void addChild(AbstractHtmlTag tag) {

        if (tag.getParentTag() == null) {
            throw new IllegalArgumentException("Hiba");
        }
        childTags.add(tag);
    }

    @Override
    public String getHtmlAsString() {
        childTags.forEach((c) -> {
            htmlString.append(this.behuz + c.getHtmlAsString());
        });
        return htmlString.toString();
    }

}

