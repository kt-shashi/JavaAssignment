package Assignment6;

import Assignment6.coordinates.Cartesian;
import Assignment6.coordinates.Polar;

public class Question2 {

    public static void main(String args[]) {
        Cartesian cartesian = new Cartesian(4, 7);
        Polar polar = new Polar(4, 8.9);

        cartesian.toPolar();
        polar.toCartesian();
    }
}