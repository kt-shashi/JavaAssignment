package Assignment6.geoshapes;

import java.lang.Math;

public class Triangle {

    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double s = (a + b + c) / 2;
        double area = s * (s - a) * (s - b) * (s - c);
        area = Math.abs(area);
        return Math.sqrt(area);
    }

    public double perimeter() {
        return (a + b + c);
    }

}
