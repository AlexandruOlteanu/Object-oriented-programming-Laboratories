package lab2.task1;

public class Complex {
    private int real, imaginar;

    public Complex(int r, int i){
        this.real = r;
        this.imaginar = i;
    }

    public Complex(){
        this(0, 0);
    }

    public Complex(Complex numar){
        this.real = numar.real;
        this.imaginar = numar.imaginar;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real){
        this.real = real;
    }

    public int getImaginar(){
        return imaginar;
    }

    public void setImaginar(int imaginar) {
        this.imaginar = imaginar;
    }

    public void addWithComplex(Complex number){
        this.real += number.real;
        this.imaginar += number.imaginar;
    }

    public void showNumber(){
        char c = '+';
        int p = this.imaginar;
        if(p < 0){
            p = -p;
            c = '-';
        }
        System.out.printf("The number is: %d%c%di\n", this.real, c , p);
    }
}
