package Assignment8;// Assignment 8
// Question 3
// 2021PGCACA050

import java.util.Scanner;

public class Assignment8_Q3 {
    public static void main(String[] args) {

        Scanner inputHelper = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = inputHelper.nextLine();

        System.out.print("Enter number of times to left shift: ");
        int n = inputHelper.nextInt();
        System.out.println("After left shift: " + leftShift(str, n));

        System.out.print("Enter number of times to right shift: ");
        n = inputHelper.nextInt();
        System.out.println("After right shift: " + rightShift(str, n));

    }

    public static String leftShift(String str, int n) {
        String str1 = str.substring(n);
        String str2 = str.substring(0, n);
        return str1 + str2;
    }

    public static String rightShift(String str, int n) {
        String str1 = str.substring(str.length() - n);
        String str2 = str.substring(0, str.length() - n);
        return str1 + str2;
    }

}
