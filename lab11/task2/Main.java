package lab11.task2;

import lab11.task1.TestMultiMapValue;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(final String[] args) {
        TestMultiMapValue testMultiMapValue = new TestMultiMapValue();
        testMultiMapValue.setup();
        //testMultiMapValue.testAddElementWithOneValue();
        //testMultiMapValue.testAddElementWithMoreValues();
        //testMultiMapValue.testAddTwoElements();
        //testMultiMapValue.testGetFirst();
        //testMultiMapValue.testContainsKey();
        //testMultiMapValue.testSize();
        //testMultiMapValue.testRemoveKey();
        //testMultiMapValue.testAddAllWithList();
        testMultiMapValue.testAddAllWithMultiMapValue();

        MyVector3 vector1 = new MyVector3();
        vector1.setVector(new Integer[]{1, 2, 3});
        MyVector3 vector2 = new MyVector3();
        vector2.setVector(new Integer[]{4, 5, 6});
        vector1.addValue(vector2);

        MyMatrix matrix1 = new MyMatrix();
        matrix1.setMatrix(new Integer[][]{{1, 2, 3, 4},{1, 2, 3, 4},{1, 2, 3, 4},{1, 2, 3, 4}});
        MyMatrix matrix2 = new MyMatrix();
        matrix2.setMatrix(new Integer[][]{{2, 3, 4, 5}, {1, 2, 3, 4}, {-1, -5, -2 , -2}, {1, 2, 3, 4}});

        matrix1.addValue(matrix2);

        List<Summable> list = new ArrayList<>();
        list.add(vector1);
        list.add(vector2);
        list.add(matrix1);
        list.add(matrix2);

        int value = Summable.addAll(list);

        System.out.println(value);

    }
}
