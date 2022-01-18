package lab6.task1_2_3_4_5;

import lab6.task1_2_3_4_5.Car;

import java.util.ArrayList;
import java.util.Random;

public class Test {

    public static void main(String[] args) {
        Car car1 = new Car(200000, 2017, Car.CarType.Ferrari);
        Car car2 = new Car(167000, 2013, Car.CarType.Mercedes);
        Car car3 = new Car(17800, 2003, Car.CarType.Dacia);

        Dealership deal = new Dealership();
        System.out.printf("Final price: %d\n", deal.getFinalPrice(car1));

        Dealership.SpecialOffer run = deal.new SpecialOffer(){
            private int discount = 200;
            public int getDiscount(Car car){
                return discount;
            }
        };

        Random rand = new Random();
        int apply = rand.nextInt(2);
        if(apply == 0){
            System.out.println("Client offer not applied\n\n");
        }
        else{
            deal.negotiate(car1, run);
        }

        System.out.printf("Final price: %d\n", deal.getFinalPrice(car2));
        apply = rand.nextInt(2);
        if(apply == 0){
            System.out.println("Client offer not applied\n\n");
        }
        else{
            deal.negotiate(car2, run);
        }

        System.out.printf("Final price: %d\n", deal.getFinalPrice(car3));
        apply = rand.nextInt(2);
        if(apply == 0){
            System.out.println("Client offer not applied\n\n");
        }
        else{
            deal.negotiate(car3, run);
        }

        ArrayList<Car> list = new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(car3);

        System.out.println("Before Removing");
        for(Car car : list){
            System.out.println(car.getPrice());
        }

        list.removeIf((car) -> car.getPrice() > 100000);

        System.out.println("After Removing");
        for(Car car : list){
            System.out.println(car.getPrice());
        }
    }

}
