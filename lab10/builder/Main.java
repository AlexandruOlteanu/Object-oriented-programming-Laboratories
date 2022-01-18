package lab10.builder;

public class Main {

    public static void main(String[] args) {

        House.HouseBuilder houseBuilder = new House.HouseBuilder("Romania", 4, 7, 100);
        House house = houseBuilder.build();
        System.out.println(house.toString());

        House.HouseBuilder houseBuilder1 = new House.HouseBuilder("Germania", 5, 9, 120);
        houseBuilder1.electronics("Frigider, Masina de Spalat, Prajitor");
        houseBuilder1.pool("Piscina mare, 2m adancime, toate facilitatile");
        houseBuilder1.security("Camere Hd si incuietori performante");
        House house1 = houseBuilder1.build();
        System.out.println(house1.toString());

    }

}
