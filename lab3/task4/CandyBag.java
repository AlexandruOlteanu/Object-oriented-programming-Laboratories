package lab3.task4;

import lab3.task1.CandyBox;
import lab3.task2.Baravelli;
import lab3.task2.ChocAmor;
import lab3.task2.Lindt;

import java.util.ArrayList;

public class CandyBag {

    private ArrayList<CandyBox> Bag = new ArrayList();

    public CandyBag() {

        Baravelli Candy1 = new Baravelli(2, 3, "ciocolata", "Romania");
        ChocAmor Candy2 = new ChocAmor(6, "vanilie", "Belgia");
        Lindt Candy3 = new Lindt(1, 2, 3, "frisca", "Luxemburg");

        Bag.add(Candy1);
        Bag.add(Candy2);
        Bag.add(Candy3);
    }

    public ArrayList<CandyBox> getBag() {
        return Bag;
    }
}
