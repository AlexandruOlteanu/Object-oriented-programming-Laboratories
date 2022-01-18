package lab2.task1;

// Clasa pentru testarea clasei Complex

public class main {

    public static void main(String[] args) {

        Complex num = new Complex();
        Complex num2 = new Complex(2, 6);

        System.out.println(num.getReal());
        System.out.println(num.getImaginar());

        System.out.println(num2.getReal());
        System.out.println(num2.getImaginar());

        num.setReal(10);
        num.setImaginar(11);

        System.out.println(num.getReal());
        System.out.println(num.getImaginar());

        num.addWithComplex(num2);

        num.showNumber();

        num.setImaginar(-21);

        num.showNumber();

    }
}
