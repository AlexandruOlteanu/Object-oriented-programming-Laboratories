package lab3.task2;

import lab3.task1.CandyBox;

public class main {
    public static void main(String[] args){
        Lindt Lin = new Lindt(1, 2, 3, "ciocolata", "Romania");
        System.out.println(Lin.getVolume());
        System.out.println(Lin.toString());

        Baravelli Bra = new Baravelli(2, 3, "frisca", "Grecia");
        System.out.println(Bra.getVolume());
        System.out.println(Bra.toString());

        ChocAmor Cho = new ChocAmor(4, "parmezan", "Italia");
        System.out.println(Cho.getVolume());
        System.out.println(Cho.toString());

    }
}
