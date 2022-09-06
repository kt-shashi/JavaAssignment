package Assignment6;

import Assignment6.geoshapes.Circle;
import Assignment6.geoshapes.Rectangle;
import Assignment6.geoshapes.Sphere;
import Assignment6.geoshapes.Triangle;

public class Question1 {

    public static void main(String[] args) {

        Circle circle = new Circle(10);
        System.out.println("Area of circle: " + circle.area());
        System.out.println("Perimeter of circle: " + circle.perimeter());

        Rectangle rectangle = new Rectangle(100, 200);
        System.out.println("Area of rectangle: " + rectangle.area());
        System.out.println("Perimeter of rectangle: " + rectangle.perimeter());

        Sphere sphere = new Sphere(100);
        System.out.println("Area of sphere: " + sphere.area());

        Triangle triangle = new Triangle(100, 200, 500);
        System.out.println("Area of triangle: " + triangle.area());
        System.out.println("Perimeter fo triangle: " + triangle.perimeter());

    }

}
