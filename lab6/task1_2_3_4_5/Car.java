package lab6.task1_2_3_4_5;

import java.util.Random;

interface Offer{
    int getDiscount(Car car);
}

public class Car {

    private int price;
    private int year;
    private CarType cartype;

    public Car(){

    }
    public Car(int price, int year, CarType cartype){
        this.price = price;
        this.year = year;
        this.cartype = cartype;
    }

    enum CarType{
        Ferrari,
        Mercedes,
        Dacia
    }

    public int getPrice(){
        return this.price;
    }

    public int getYear(){
        return this.year;
    }

    public CarType getCarType(){
        return this.cartype;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setCartype(CarType cartype){
        this.cartype = cartype;
    }

}

class Dealership{
    class BrandOffer implements Offer{
        public int getDiscount(Car car) {
            if (car.getCarType() == Car.CarType.Ferrari) {
                return (int) (2. / 100 * car.getPrice());
            }
            if (car.getCarType() == Car.CarType.Mercedes) {
                return (int) (3. / 100 * car.getPrice());
            }
            return (int) (5. / 100 * car.getPrice());
        }
    }
    class DealerOffer implements Offer{
        public int getDiscount(Car car){
            return (2021 - car.getYear()) * 50;
        }
    }
    class SpecialOffer implements Offer {
        public int getDiscount(Car car) {
            Random rand = new Random();
            return rand.nextInt(300);
        }
    }

    public SpecialOffer getSpecialOffer(){
        SpecialOffer offer = new SpecialOffer();
        return offer;
    }

    void negotiate(Car car, Offer offer){
        System.out.printf("Applying Client discount: %d\n", offer.getDiscount(car));
        car.setPrice(car.getPrice() - offer.getDiscount(car));
        System.out.printf("Final price after negotiation: %d\n\n", car.getPrice());
    }

    public int getFinalPrice(Car car){
        System.out.printf("Initial price is : %d lei\n", car.getPrice());

        BrandOffer brandoffer = new BrandOffer();
        DealerOffer dealeroffer = new DealerOffer();
        SpecialOffer specialoffer = new SpecialOffer();

        System.out.printf("Applying Brand discount: %d lei\n", brandoffer.getDiscount(car));

        System.out.printf("Applying Dealer discount: %d lei\n", dealeroffer.getDiscount(car));

        System.out.printf("Applying Special discount: %d lei\n", specialoffer.getDiscount(car));

        car.setPrice(car.getPrice() - brandoffer.getDiscount(car) - dealeroffer.getDiscount(car) - specialoffer.getDiscount(car));

        return car.getPrice();
    }

}