// Assignment 1
// Question 3

// Shashi Kant | 2021PGCACA050

import java.util.Scanner;

class Assignment1_Question3 {

    public static void main(String[] args) {

        System.out.println("--MENU--");
        System.out.println("1. Feet to Meter ");
        System.out.println("2. Minutes to Years and days");
        System.out.println("3. HorsePower to Joules");
        System.out.println("Enter choice: ");
        Scanner inputHelper = new Scanner(System.in);
        int ch = inputHelper.nextInt();

        switch (ch) {

            case 1: {
                System.out.println("Enter feet: ");
                double feet = inputHelper.nextDouble();
                Assignment1_Question3 obj = new Assignment1_Question3();
                System.out.println("(In meters): " + obj.getInMeters(feet));
            }
            break;
            case 2:

                System.out.println("Enter Minutes: ");
                long mins = inputHelper.nextLong();

                long years = mins / (24 * 60 * 365);
                long days = (mins % (24 * 60 * 365)) / (24 * 60);

                System.out.println("Years: " + years);
                System.out.println("Days: " + days);

                break;
            case 3: {
                System.out.println("Enter Horsepower: ");
                double horsePower = inputHelper.nextDouble();
                Assignment1_Question3 obj = new Assignment1_Question3();
                System.out.println("(In Joules): " + obj.getInJoules(horsePower));
            }
            break;
            default:
                System.out.println("Invalid Input!");

        }

    }

    private double getInMeters(double feet) {
        return feet / 3.281;
    }

    private double getInJoules(double horsePower) {
        return horsePower * 745.69987158;
    }

}
