package lab3.task3;

import lab3.task2.Lindt;

public class main {
    public static void main(String[] args){
        Lindt obj1 = new Lindt(1, 2, 3, "Romania", "ciocolata");
        Lindt obj2 = new Lindt(1, 2, 3, "Romania", "ciocolata");
        Lindt obj3 = new Lindt(1, 3, 2, "Rusia", "Vanilie");
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.equals(obj3));
    }
}
