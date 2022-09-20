package Assignment8;// Assignment 8
// Question 1
// 2021PGCACA050

import java.util.Scanner;

public class Assignment8_Q1 {

    public static void main(String[] args) {

        Scanner inputHelper = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = inputHelper.nextLine();
        System.out.print("Enter second string: ");
        String str2 = inputHelper.nextLine();

        System.out.print("Enter length: ");
        int k = inputHelper.nextInt();

        commonSubstring(str1, str2, k);

    }

    public static void commonSubstring(String str1, String str2, int k) {

        int flag = 0;

        for (int i = 0; i < str1.length() - k + 1; i++) {
            for (int j = 0; j < str2.length() - k + 1; j++) {
                if (str1.substring(i, i + k).equals(str2.substring(j, j + k))) {
                    System.out.println("Common substring of length " + k + " found in String 1 at index " + i + " and in String 2 at index " + j);
                    flag = 1;
                }
            }
        }

        if (flag == 0) {
            System.out.println("Substring of length " + k + " not found.");
        }

    }
}
