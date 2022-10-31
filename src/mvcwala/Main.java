package mvcwala;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        PenController penController = new PenController();
        Scanner inputHelper = new Scanner(System.in);

        boolean flag = true;
        while (flag) {

            System.out.println("-MENU-");
            System.out.println("1. Buy pen");
            System.out.println("2. Exit");
            System.out.println("Enter choice: ");

            int choice;
            choice = inputHelper.nextInt();

            switch (choice) {
                case 1:

                    System.out.println("How many pens do you wish to buy?");
                    int noOfPen = inputHelper.nextInt();

                    Pen pen = new Pen("PenX", "Black", "Shashi Enterprise", 10);
                    PenView penView = new PenView(pen);

                    penController.setPen(pen);
                    penController.setPenView(penView);
                    boolean isSold = penController.sellPen(noOfPen);
                    if (isSold) {

                        System.out.println(noOfPen + " have been sold");
                        penController.updateView();
                        System.out.println("-Bill-");
                        System.out.println(pen.getPrice() + "*" + noOfPen + " = Rs." + pen.getPrice() * noOfPen);

                    } else {
                        penController.updateViewQuantity();
                        System.out.println("Not enough Pens!");
                    }

                    break;
                case 2:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }

        }

    }
}
