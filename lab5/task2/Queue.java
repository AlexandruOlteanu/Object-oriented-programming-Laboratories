package lab5.task2;

import lab5.task1.Task;

import java.util.ArrayList;

public class Queue extends Stack implements Container {


    public Task pop(){
        Task task1 = list.get(0);
        list.remove(0);
        return task1;
    }


}
