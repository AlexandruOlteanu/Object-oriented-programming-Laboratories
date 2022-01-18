package lab7.task1.document;

public class MarkdownWiki implements Visitor{

    @Override
    public void visit(BoldTextSegment bold) {
        StringBuilder content = new StringBuilder();
        content.append("__");
        content.append(bold.getContent());
        content.append("__");
        bold.setChangedContent(content.toString());
    }

    @Override
    public void visit(ItalicTextSegment italic) {
        StringBuilder content = new StringBuilder();
        content.append("_");
        content.append(italic.getContent());
        content.append("_");
        italic.setChangedContent(content.toString());
    }

    @Override
    public void visit(PlainTextSegment plain) {
        plain.setChangedContent(plain.getContent());
    }

    @Override
    public void visit(UrlSegment url) {
        StringBuilder content = new StringBuilder();
        content.append("[");
        content.append(url.getName());
        content.append("]");
        content.append("(");
        content.append(url.getLink());
        content.append(")");
        url.setChangedContent(content.toString());
    }
}
