package Assignment6;

import Assignment6.coordinates.Cartesian;
import Assignment6.coordinates.Polar;

public class Question2 {

    public static void main(String args[]) {
        Cartesian cartesian = new Cartesian(8, 8);
        Polar polar = new Polar(8, 8);

        cartesian.toPolar();
        polar.toCartesian();
    }
}