package lab7.task1.document;

public class ItalicTextSegment extends TextSegment{

    public ItalicTextSegment(String content) {
        super(content);
    }

    @Override
    public void acceptDoku(Visitor doku) {
        doku.visit(this);
    }

    @Override
    public void acceptMarkdown(Visitor markdown) {
        markdown.visit(this);
    }


}
