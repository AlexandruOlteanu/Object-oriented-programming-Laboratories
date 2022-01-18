package lab9.dataprocessing;

import lab9.storage.DataRepository;
import lab9.storage.SensorData;

import java.util.List;

public class BasicStepCountStrategy implements StepCountStrategy{

    private List<SensorData> list = null;
    private int sum = 0;
    @Override
    public int getTotalSteps() {
        for (SensorData sensor : list){
            sum += sensor.getStepsCount();
        }
        return sum;
    }

    public BasicStepCountStrategy(DataRepository dataRepository){
        this.list = dataRepository.getList();
    }

    public void setList(List<SensorData> list) {
        this.list = list;
    }

    public List<SensorData> getList() {
        return list;
    }

    @Override
    public String getStrategyDescription() {
        return "Basic Step Count : adding up all values received";
    }
}
