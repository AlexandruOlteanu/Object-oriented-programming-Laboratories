package lab11.task2;

public class MyMatrix implements Summable{

    private Integer[][] matrix = new Integer[4][4];

    @Override
    public void addValue(Summable value) {
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                matrix[i][j] += ((MyMatrix)value).getMatrix()[i][j];
            }
        }
    }

    public void setMatrix(Integer[][] matrix) {
        this.matrix = matrix;
    }

    public Integer[][] getMatrix() {
        return matrix;
    }
}
