package Assignment6.coordinates;

public class Polar {

    double r, theta;

    public Polar(double r, double theta) {
        this.r = r;
        this.theta = theta;
    }

    public void toCartesian() {
        double x = r * Math.cos(theta);
        double y = r * Math.sin(theta);
        System.out.println("Polar to Cartesian Conversion:( " + x + "," + y + ")");
    }
}