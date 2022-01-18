package lab2.task3;

public class Polygon {

    Point[] P;

    public Polygon(int n){
        P = new Point[n];
    }

    public Polygon(float [] points){
        this(points.length / 2);
        int sz = points.length / 2;
        int k = 0;
        for(int i = 0; i < sz; ++i){
            this.P[i] = new Point(points[k], points[k + 1]);
            k += 2;
        }
    }
}
