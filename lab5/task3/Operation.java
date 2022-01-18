package lab5.task3;

import java.util.*;

public class Operation implements Minus,Plus, Mult, Div {
     private float number = 0;

     public Operation(float init_num){
         this.number = init_num;
     }

     public void plus(float x){
        this.number += x;
     }

    public void minus(float x){
        this.number -= x;
    }

    public void mult(float x){
        this.number *= x;
    }

    public void div(float x){
         if (x == 0){
            System.out.println("Error, Division by 0");
            return;
         }
        this.number /= x;
    }

    void setInit_num(float x){
         this.number = x;
    }

    public float getNumber(){
         return this.number;
    }

}
