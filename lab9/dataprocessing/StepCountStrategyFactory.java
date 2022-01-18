package lab9.dataprocessing;

import lab9.storage.DataRepository;

public class StepCountStrategyFactory {

    public StepCountStrategy createStrategy(String strategyType, DataRepository dataRepository){
        switch (strategyType){
            case "basic" : return new BasicStepCountStrategy(dataRepository);
            case "filtered" : return new FilteredStepCountStrategy(dataRepository);
        }
        throw new IllegalArgumentException("The Step Count Type " + strategyType + " it's not recognized");
    }

}
