package lab10.commands;

import lab10.diagram.DiagramComponent;

public class ResizeCommand implements DrawCommand{

    private DiagramComponent diagramComponent = null;
    private int procent;
    private int previousHeight;
    private int previousWidth;
    private int nextHeight;
    private int nextWidth;

    public ResizeCommand(DiagramComponent diagramComponent, int procent){
        this.diagramComponent = diagramComponent;
        this.procent = procent;
        this.nextHeight = diagramComponent.getHeight();
        this.nextWidth = diagramComponent.getWeight();
    }

    @Override
    public void execute() {
        previousHeight = diagramComponent.getHeight();
        diagramComponent.setHeight(nextHeight * procent / 100);

        previousWidth = diagramComponent.getWeight();
        diagramComponent.setWeight(nextWidth * procent / 100);
    }

    @Override
    public void undo() {
        nextHeight = previousHeight;
        previousHeight = diagramComponent.getHeight();
        diagramComponent.setHeight(nextHeight);

        nextWidth = previousWidth;
        previousWidth = diagramComponent.getWeight();
        diagramComponent.setWeight(nextWidth);
    }

    @Override
    public String toString() {
        return "ResizeCommand{" +
                "diagramComponent=" + diagramComponent +
                ", procent=" + procent +
                '}';
    }

}
