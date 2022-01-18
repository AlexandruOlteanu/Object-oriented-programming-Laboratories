package lab7.task1.document;

public class UrlSegment extends TextSegment{

    private String link, name;
    public UrlSegment(String link, String name) {
        super(link);
        this.link = link;
        this.name = name;
    }

    @Override
    public void acceptDoku(Visitor doku) {
        doku.visit(this);
    }

    @Override
    public void acceptMarkdown(Visitor markdown) {
        markdown.visit(this);
    }

    public String getLink() {
        return link;
    }

    public String getName() {
        return name;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setName(String name) {
        this.name = name;
    }
}
