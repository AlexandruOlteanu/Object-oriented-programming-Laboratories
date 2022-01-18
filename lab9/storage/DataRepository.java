package lab9.storage;


import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Persists sensor data. Observable, its observers are notified when data is added it to.
 */
public class DataRepository extends Observable { // TODO make this an Observable
    private List<SensorData> list = new ArrayList<>();
    public void addData(SensorData dataRecord){
        list.add(dataRecord);
        setChanged();
        notifyObservers();
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    public List<SensorData> getList() {
        return list;
    }

    public void setList(List<SensorData> list) {
        this.list = list;
    }
}


