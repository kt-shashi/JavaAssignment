package Assignment6.geoshapes;

public class Circle {

    private double radius;
    public final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return PI * radius * radius;
    }

    public double perimeter() {
        return 2 * PI * radius;
    }

}
