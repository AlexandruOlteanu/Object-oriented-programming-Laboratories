package lab11.task2;

public class MyVector3 implements Summable{

    private Integer[] vector = new Integer[3];

    @Override
    public void addValue(Summable value) {
        for (int i = 0; i < 3; ++i) {
            vector[i] += ((MyVector3)value).getVector()[i];
        }
    }

    public void setVector(Integer[] vector) {
        this.vector = vector;
    }

    public Integer[] getVector() {
        return vector;
    }

}
