package lab1.task1;

public class VeterinaryReport {
    int dogs;
    int cats;

    public int getAnimalsCount() {
        return this.dogs + this.cats;
    }

    public void displayStatistics() {
        System.out.println("Total number of animals is " + this.getAnimalsCount());
    }
}