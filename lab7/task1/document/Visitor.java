package lab7.task1.document;

public interface Visitor{
    public void visit(BoldTextSegment bold);
    public void visit(ItalicTextSegment italic);
    public void visit(PlainTextSegment plain);
    public void visit(UrlSegment url);
}