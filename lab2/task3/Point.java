package lab2.task3;

public class Point {

    private float x, y;

    public float getX() {
        return x;
    }

    public void setX(float x){
        this.x = x;
    }

    public float getY(){
        return y;
    }

    public void setY(float y){
        this.y = y;
    }

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public void changeCoords(float new_x, float new_y){
        this.x = new_x;
        this.y = new_y;
    }

    public void showPoint(){
        System.out.printf("(%f, %f)\n", this.x, this.y);
    }

    @Override
    public String toString(){
        return "(" + this.x + ", " + this.y + ")\n" ;
    }


}
