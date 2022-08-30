package Assignment6.coordinates;

public class Cartesian {

    double x, y;

    public Cartesian(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void toPolar() {
        double r = (x * x + y * y);
        r = Math.sqrt(r);
        double theta = Math.atan(y / x);

        System.out.println("Cartesian to Polar Conversion: (" + r + "," + theta + ")");
    }
}