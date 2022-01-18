package lab5.task1;

public class OutTask implements Task{
        String message = "";
        public OutTask(String s){
            message = s;
        }
        public void execute(){
            System.out.println(message);
        }
}
