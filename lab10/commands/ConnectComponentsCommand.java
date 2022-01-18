package lab10.commands;

import lab10.diagram.DiagramComponent;

public class ConnectComponentsCommand implements DrawCommand{


    private DiagramComponent diagramComponent = null;
    private String id = "";

    public ConnectComponentsCommand(DiagramComponent diagramComponent, String id){
        this.diagramComponent = diagramComponent;
        this.id = id;
    }

    @Override
    public void execute() {
        diagramComponent.connectTo(id);
    }

    @Override
    public void undo() {
        diagramComponent.removeConnection(id);
    }

    @Override
    public String toString() {
        return "ConnectComponentsCommand{" +
                "diagramComponent=" + diagramComponent +
                ", id='" + id + '\'' +
                '}';
    }
}
