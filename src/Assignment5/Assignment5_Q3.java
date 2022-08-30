// Assignment 5
// Question 3

// Shashi Kant | 2021PGCACA050

import java.util.*;
import java.lang.*;

class UserNumericString extends Exception {
    private double a;
    private double b;

    public String toString() {
        return "Exception: String contains number values as substring in it";
    }
}

public class Assignment5_Q3 {

    public static void main(String[] args) {

        // User input
        String s;
        Scanner inputHelper = new Scanner(System.in);
        System.out.println("Enter a string: ");
        s = inputHelper.next();

        try {

            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    throw new UserNumericString();
                }
            }

            System.out.println("String is: " + s);

        } catch (Exception e) {
            System.out.println("Caught: " + e);
        }


    }

}

