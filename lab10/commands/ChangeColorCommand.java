package lab10.commands;

import lab10.diagram.DiagramComponent;

public class ChangeColorCommand implements DrawCommand{

    private DiagramComponent diagramComponent = null;
    private String previousColor = "";
    private String nextColor = "";

    public ChangeColorCommand(DiagramComponent diagramComponent, String color){
        this.diagramComponent = diagramComponent;
        this.nextColor = color;
    }

    @Override
    public void execute() {
        previousColor = diagramComponent.getColor();
        diagramComponent.setColor(nextColor);

    }

    @Override
    public void undo() {
        nextColor = previousColor;
        previousColor = diagramComponent.getColor();
        diagramComponent.setColor(nextColor);
    }


    @Override
    public String toString() {
        return "ChangeColorCommand{" +
                "diagramComponent=" + diagramComponent +
                ", color='" + nextColor + '\'' +
                '}';
    }

}
