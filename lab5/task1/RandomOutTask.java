package lab5.task1;
import java.util.Random;

public class RandomOutTask implements Task{

    int random_number = 0;

    public RandomOutTask(){
        Random rand = new Random();
        random_number = rand.nextInt(10000);
    }

    public void execute(){
        System.out.println(random_number);
    }
}
