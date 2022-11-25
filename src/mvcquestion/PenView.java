package mvcquestion;

public class PenView {

    void printPenDetails(String name, String color, String companyName, double price) {

        System.out.println("Pen name: " + name);
        System.out.println("Pen color: " + color);
        System.out.println("Pen company: " + companyName);
        System.out.println("Pen price: Rs." + price);

    }

    void printQuantityDetails(int quantity) {
        System.out.println("No. of pens left: " + quantity);
    }

}
