package lab9.dataprocessing;

import lab9.storage.DataRepository;
import lab9.storage.SensorData;

import java.util.List;
import java.util.concurrent.TimeUnit;

import lab9.main.Utils;

public class FilteredStepCountStrategy implements StepCountStrategy{

    private static final long MAX_DIFF_STEPS_CONSECUTIVE_RECORDS = 1000;
    private static final long TIME_FOR_MAX_DIFF = TimeUnit.SECONDS.toMillis(1);
    private List<SensorData> list = null;
    private int sum = 0;

    public FilteredStepCountStrategy(DataRepository dataRepository){
        this.list = dataRepository.getList();
    }

    @Override
    public int getTotalSteps() {
        for (SensorData sensorData : list){
            if (sensorData.getStepsCount() >= 0){
                if (sensorData.getTimestamp() <= MAX_DIFF_STEPS_CONSECUTIVE_RECORDS){
                    sum += sensorData.getStepsCount();
                }
                else{
                    if (sensorData.getTimestamp() > TIME_FOR_MAX_DIFF){
                        sum += sensorData.getStepsCount();
                    }
                }
            }
        }
        return sum;
    }

    @Override
    public String getStrategyDescription() {
        return "Filtered Step Count : adding up all values that go by some filters";
    }

    public void setList(List<SensorData> list) {
        this.list = list;
    }

    public List<SensorData> getList() {
        return list;
    }
}
