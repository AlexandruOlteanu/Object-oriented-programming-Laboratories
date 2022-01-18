package lab11.task2;

import java.util.List;

public interface Summable {
    void addValue(Summable value);

    public static Integer addAll(List<? extends Summable> list) {
        Integer sum = 0;
        for (Summable obj : list) {
            if (obj instanceof MyVector3) {
                for (int i = 0; i < 3; ++i) {
                    sum += ((MyVector3) obj).getVector()[i];
                }
            }
            else {
                for (int i = 0; i < 4; ++i) {
                    for (int j = 0; j < 4; ++j) {
                        sum += ((MyMatrix) obj).getMatrix()[i][j];
                    }
                }
            }
        }
        return sum;
    }
}
