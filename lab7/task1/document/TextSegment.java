package lab7.task1.document;

/**
 * Represents a text segment of a document that needs to be parsed.
 */


public abstract class TextSegment {
    private String content;
    private String changedContent = new String();

    TextSegment(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content){
        this.content = content;
    }

    public String getChangedContent() {
        return changedContent;
    }
    public void setChangedContent(String changedContent) {
        this.changedContent = changedContent;
    }
    // TODO add method for applying the visitor

    public abstract void acceptDoku(Visitor doku);
    public abstract void acceptMarkdown(Visitor markdown);
}
