package Assignment6.geoshapes;

public class Sphere {

    private double radius;
    public final double PI = 3.14;

    public Sphere(int radius) {
        this.radius = radius;
    }

    public double area() {
        return 4 * PI * radius * radius;
    }

}
