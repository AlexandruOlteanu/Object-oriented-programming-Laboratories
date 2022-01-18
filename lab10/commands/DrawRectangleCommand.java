package lab10.commands;

import lab10.diagram.DiagramCanvas;
import lab10.diagram.DiagramComponent;

public class DrawRectangleCommand implements DrawCommand{

    private DiagramCanvas diagramCanvas = null;
    private DiagramComponent diagramComponent = null;

    public DrawRectangleCommand(DiagramCanvas diagramCanvas){
        this.diagramCanvas = diagramCanvas;
    }

    @Override
    public void execute() {
        diagramComponent = new DiagramComponent();
        diagramCanvas.addComponent(diagramComponent);
    }

    @Override
    public void undo() {
        diagramCanvas.removeComponent(diagramComponent);
    }

    @Override
    public String toString() {
        return "DrawRectangleCommand{" +
                "diagramCanvas=" + diagramCanvas +
                '}';
    }
}
