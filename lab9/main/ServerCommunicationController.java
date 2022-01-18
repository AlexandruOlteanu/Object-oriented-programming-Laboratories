package lab9.main;

import lab9.communication.ServerMessage;
import lab9.storage.DataRepository;
import lab9.storage.SensorData;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public class ServerCommunicationController implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        DataRepository obj = (DataRepository)o;
        Utils utils = new Utils();
        SensorData sensorData = obj.getList().get(obj.getList().size() - 1);
        Random rand = new Random();

        ServerMessage serverMessage = new ServerMessage(sensorData.getStepsCount(), rand.nextInt(1000), sensorData.getTimestamp());
        System.out.printf("Changes are on the server : %s\n", serverMessage.toString());
    }
}
