package lab3.task2;

import lab3.task1.CandyBox;

public class Lindt extends CandyBox {
    private float length, width, height;

    public Lindt(){

    }

    public Lindt(float length, float width, float height, String flavor, String origin){
        super(flavor, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public float getVolume(){
        return (float)(this.length * this.width * this.height);
    }

    public String toString(){
        return (super.toString() + " has volume " + this.getVolume());
    }

    // task 5
    public void printLindtDim(){
        System.out.printf("Dimensions are length of %f, width of %f and height of %f", this.length, this.width, this.height);
    }
}
