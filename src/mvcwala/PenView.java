package mvcwala;

public class PenView {

    Pen pen;

    PenView(Pen pen) {
        this.pen = pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    void printPenDetails() {

        System.out.println("Pen name: " + pen.getName());
        System.out.println("Pen color: " + pen.getColor());
        System.out.println("Pen company: " + pen.getCompanyName());
        System.out.println("Pen price: Rs." + pen.getPrice());

    }

    void printQuantityDetails() {
        System.out.println("No. of pens left: " + Pen.quantity);
    }

}
