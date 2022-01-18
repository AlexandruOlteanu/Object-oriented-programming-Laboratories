package lab5.task2;

import lab5.task1.Task;

import java.util.ArrayList;

public class Stack implements Container {
    ArrayList<Task> list = new ArrayList<Task>();

    public Task pop(){
        Task task1 = list.get(size() - 1);
        list.remove(size() - 1);
        return task1;
    }

    public void push(Task task1){
        list.add(task1);
    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public ArrayList<Task> getTasks(){
        return list;
    }

    public void transferFrom(Container container){
        ArrayList<Task> list1 = container.getTasks();
        for (Task task : list1){
            list.add(task);
        }
        while (!container.getTasks().isEmpty()){
            container.pop();
        }
    }
}
