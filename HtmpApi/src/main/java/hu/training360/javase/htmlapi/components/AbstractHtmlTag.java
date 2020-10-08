package hu.training360.javase.htmlapi.components;

public abstract class AbstractHtmlTag implements HtmlInterface{
    private String id;
    private String style;

    private final AbstractHtmlTag parentTag;

    protected StringBuilder htmlString = new StringBuilder();

    protected String behuz = "   ";

    public AbstractHtmlTag(String id) {
        this.id = id;
        this.parentTag = null;
    }

    public AbstractHtmlTag(String id, AbstractHtmlTag parentTag) {
        this.id = id;
        this.parentTag = parentTag;
        this.behuz += parentTag.behuz;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AbstractHtmlTag getParentTag() {
        return parentTag;
    }
}
