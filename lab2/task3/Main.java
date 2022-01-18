package lab2.task3;

// Clasa pentru testatrea clasei Point si Polygon

public class Main {

    public static void main(String[] args){
        System.out.printf("Testing Class Point\n\n");

        Point p = new Point(2, (float)5.78);

        p.showPoint();

        p.changeCoords((float)3.89, (float)23.907);

        System.out.println(p.toString());

        p.setX((float) 5.9);
        p.setY((float) 2.001);

        System.out.println(p.getX());
        System.out.println(p.getY());


        System.out.printf("\nTesting Class Polygon\n\n");

        float[] points = {2, (float)5.8, (float)6.7, (float)1.9, (float)4.22, (float)9.01};
        Polygon Pol = new Polygon(points);

        int n = Pol.P.length;
        for(int i = 0; i < n; ++i){
            Pol.P[i].showPoint();
        }

    }
}
