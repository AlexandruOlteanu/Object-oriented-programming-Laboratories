package lab3.task2;

import lab3.task1.CandyBox;

public class Baravelli extends CandyBox {
    private float radius, height;

    public Baravelli(){

    }

    public Baravelli(float radius, float height, String flavor, String origin){
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }

    public float getVolume(){
        return (float)(Math.acos(-1.0) * Math.pow(this.radius, 2) * this.height);
    }

    public String toString(){
        return (super.toString() + " has volume " + this.getVolume());
    }

    // task 5
    public void printBaravelliDim(){
        System.out.printf("Dimensions are radius of %f and height of %f", this.radius, this.height);
    }

}
