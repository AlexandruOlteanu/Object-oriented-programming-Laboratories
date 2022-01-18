package lab5.task1;

public class CounterOutTask implements Task{
    public void execute(){
        ++Global.global_val;
        System.out.println(Global.global_val);
    }
}
