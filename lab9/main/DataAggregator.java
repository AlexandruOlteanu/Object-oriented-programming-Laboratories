package lab9.main;

import lab9.dataprocessing.BasicStepCountStrategy;
import lab9.dataprocessing.FilteredStepCountStrategy;
import lab9.dataprocessing.StepCountStrategy;

import java.util.Observable;
import java.util.Observer;

public class DataAggregator implements Observer {

    private String strategy;
    StepCountStrategy stepCountStrategy;

    public DataAggregator(String strategy, StepCountStrategy stepCountStrategy){
        this.strategy = strategy;
        this.stepCountStrategy = stepCountStrategy;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (strategy.equals("basic")) {
            BasicStepCountStrategy basicStrategy = (BasicStepCountStrategy)stepCountStrategy;
            System.out.printf("The total sum after basic strategy is : %d\n", basicStrategy.getTotalSteps());
        }
        else {
            FilteredStepCountStrategy filteredStrategy = (FilteredStepCountStrategy)stepCountStrategy;
            System.out.printf("The total sum after filtered strategy is : %d\n", filteredStrategy.getTotalSteps());
        }
    }
}
