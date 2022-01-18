package lab9.main;

import lab9.storage.DataRepository;

import java.util.Observable;
import java.util.Observer;

public class ConsoleLogger implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        DataRepository obj = (DataRepository)o;
        System.out.printf("Object %s was added to the list!\n", obj.getList().get(obj.getList().size() - 1));
    }
}
