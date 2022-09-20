package Assignment8;// Assignment 8
// Question 2
// 2021PGCACA050

import java.util.Scanner;

public class Assignment8_Q2 {

    public static void main(String[] args) {

        Scanner inputHelper = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = inputHelper.nextLine();

        insertString(str);
        replaceString(str);
        deleteString(str);

    }

    public static void insertString(String str) {

        Scanner inputHelper = new Scanner(System.in);

        System.out.println("Enter string to be inserted: ");
        String str1 = inputHelper.nextLine();

        System.out.println("Enter index at which string is to be inserted: ");
        int index = inputHelper.nextInt();

        System.out.println("String after insertion: " + str.substring(0, index) + str1 + str.substring(index));

    }

    public static void replaceString(String str) {

        Scanner inputHelper = new Scanner(System.in);

        System.out.println("Enter string to be replaced: ");
        String str1 = inputHelper.nextLine();

        System.out.println("Enter index at which string is to be replaced: ");
        int index = inputHelper.nextInt();

        System.out.println("String after replacing: " + str.substring(0, index) + str1
                + str.substring(index + str1.length()));

    }

    public static void deleteString(String str) {

        Scanner inputHelper = new Scanner(System.in);

        System.out.println("Enter index at which string is to be deleted: ");
        int index = inputHelper.nextInt();

        System.out.println("Enter the length of the string to be deleted: ");
        int length = inputHelper.nextInt();

        System.out.println("String after deleting is: " + str.substring(0, index) + str.substring(index + length));
    }
}
