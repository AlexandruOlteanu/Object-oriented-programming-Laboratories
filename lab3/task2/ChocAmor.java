package lab3.task2;

import lab3.task1.CandyBox;

public class ChocAmor extends CandyBox {
    private float length;

    public ChocAmor(){

    }

    public ChocAmor(float length, String flavor, String origin){
        super(flavor, origin);
        this.length = length;
    }

    public float getVolume(){
        return (float)(Math.pow(length, 3));
    }

    public String toString(){
        return (super.toString() + " has volume " + this.getVolume());
    }

    // task 5
    public void printChocAmorDim(){
        System.out.printf("Dimensions are length of %f", this.length);
    }
}
