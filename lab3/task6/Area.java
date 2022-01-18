package lab3.task6;

import lab3.task1.CandyBox;
import lab3.task2.Baravelli;
import lab3.task2.ChocAmor;
import lab3.task2.Lindt;
import lab3.task4.CandyBag;

import java.util.ArrayList;

public class Area {
    CandyBag Bag = new CandyBag();
    int number;
    String street;

    public Area(){

    }

    public Area(int number, String street){
        this.number = number;
        this.street = street;
    }

    public void getBirthdayCard(){
        System.out.printf("Adresa este strada %s, numarul %d\n", this.street, this.number);
        System.out.println("La multi ani!");
        ArrayList<CandyBox> Box = Bag.getBag();

        // Parcurgerea folosind Instanceof
        for(CandyBox Candy : Box){
            if(Candy instanceof Baravelli){
                System.out.println(((Baravelli)Candy).toString());
            }
            if(Candy instanceof ChocAmor){
                System.out.println(((ChocAmor)Candy).toString());
            }
            if(Candy instanceof Lindt){
                System.out.println(((Lindt)Candy).toString());
            }
        }

        //Parcurgerea fara Instanceof
        for(CandyBox Candy : Box){
            System.out.println(Candy.toString());
        }

    }


}
