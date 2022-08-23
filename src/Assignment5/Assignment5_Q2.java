// Assignment 4
// Question 2

// Shashi Kant | 2021PGCACA050

import java.util.*;

class UserVerySmallNumException extends Exception {
    private double a;
    private double b;

    UserVerySmallNumException(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return "Division of " + a + " /" + b + "is smaller than 0.00001";
    }
}

public class Assignment5_Q2 {

    public static void main(String[] args) {

        // User input
        double a, b;
        Scanner inputHelper = new Scanner(System.in);
        System.out.println("Enter 2 numbers-");
        a = inputHelper.nextDouble();
        b = inputHelper.nextDouble();

        try {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            if (a / b < 0.00001) {
                throw new UserVerySmallNumException(a, b);
            }

            System.out.println("Ans: " + a / b);
        } catch (Exception e) {
            System.out.println("Caught: " + e);
        }


    }

}
