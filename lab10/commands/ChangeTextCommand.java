package lab10.commands;

import lab10.diagram.DiagramComponent;

public class ChangeTextCommand implements DrawCommand{

    private DiagramComponent diagramComponent = null;
    private String previousText = "";
    private String nextText = "";

    public ChangeTextCommand(DiagramComponent diagramComponent, String text){
        this.diagramComponent = diagramComponent;
        nextText = text;
    }

    @Override
    public void execute() {
        previousText = diagramComponent.getText();
        diagramComponent.setText(nextText);
    }

    @Override
    public void undo() {
        nextText = previousText;
        previousText = diagramComponent.getText();
        diagramComponent.setColor(nextText);
    }

    @Override
    public String toString() {
        return "ChangeTextCommand{" +
                "diagramComponent=" + diagramComponent +
                ", text='" + nextText + '\'' +
                '}';
    }
}
