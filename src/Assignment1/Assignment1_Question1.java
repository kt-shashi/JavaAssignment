// Assignment 1
// Question 1

// Shashi Kant | 2021PGCACA050

import java.util.Scanner;

class Assignment1_Question1 {

    public static void main(String args[]) {

        // User input
        System.out.println("Enter a number: ");
        Scanner inputHelper = new Scanner(System.in);
        int n = inputHelper.nextInt();

        long leftShift = n << 12;
        long rightShift = n >> 10;

        System.out.println("Left shift operation (4096n): " + leftShift);
        System.out.println("Right shift operation (1/1024)n: " + rightShift);

    }

}
