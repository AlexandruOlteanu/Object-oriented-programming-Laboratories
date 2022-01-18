package lab7.task1;

import lab7.task1.document.Dokuwiki;
import lab7.task1.document.MarkdownWiki;
import lab7.task1.document.TextSegment;
import lab7.task1.document.Visitor;

import java.util.List;

/**
 * Uses visitors to parse documents and provide dokuwiki and markdown outputs.
 */
public class WikiGenerator {

    private final List<TextSegment> textSegments;

    public WikiGenerator(List<TextSegment> textSegments) {
        this.textSegments = textSegments;
    }

    public StringBuilder getDokuWikiDocument() {
        // TODO apply dokuwiki visitor on the text segments
        StringBuilder finalText = new StringBuilder();
        Visitor v = new Dokuwiki();

        for(TextSegment text : textSegments){
            text.acceptDoku(v);
            finalText.append(text.getChangedContent());
        }

        return finalText;
    }

    public StringBuilder getMarkdownDocument() {
        // TODO apply Markdown visitor on the text segments
        StringBuilder finalText = new StringBuilder();
        Visitor v = new MarkdownWiki();

        for(TextSegment text : textSegments){
            text.acceptMarkdown(v);
            finalText.append(text.getChangedContent());
        }

        return finalText;
    }
}
