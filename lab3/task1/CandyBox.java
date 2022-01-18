package lab3.task1;

import java.util.Objects;

public class CandyBox {
    private String flavor, origin;

    public CandyBox(){

    }

    public CandyBox(String flavor, String origin){
        this.flavor = flavor;
        this.origin = origin;
    }

    public float getVolume(){
        return 0;
    }

    public String toString() {
        return ("The " + this.origin + " " + this.flavor);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandyBox candyBox = (CandyBox) o;
        return flavor.equals(candyBox.flavor) && origin.equals(candyBox.origin);
    }

    // Putem obersva ca prima comparatie se face intre adresele celor doua obiecte
    // Apoi se returneaza fals in cazul in care cele doua obiecte nu au aceeasi clasa.
    // Se returneaza true doar daca si membri acestor obiecte sunt egali (rezultatul egalitatii
    // se afla in acelasi mod)

    @Override
    public int hashCode() {
        return Objects.hash(flavor, origin);
    }
}
