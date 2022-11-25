package mvcquestion;

public class PenController {

    Pen pen;
    PenView penView;

    public void setPenName(String name) {
        pen.setName(name);
    }

    public void setPenColor(String color) {
        pen.setColor(color);
    }

    public void setPenCompanyName(String companyName) {
        pen.setCompanyName(companyName);
    }

    public void setPenPrice(double price) {
        pen.setPrice(price);
    }

    PenController() {
        pen = null;
        penView = null;
    }

    PenController(Pen pen, PenView penView) {
        this.pen = pen;
        this.penView = penView;
    }

    void setPen(Pen pen) {
        this.pen = pen;
    }

    void setPenView(PenView penView) {
        this.penView = penView;
    }

    boolean sellPen(int quantity) {
        if (Pen.quantity >= quantity) {
            Pen.quantity = Pen.quantity - quantity;
            return true;
        }
        return false;
    }

    void updateView() {
        penView.printPenDetails(pen.getName(), pen.getColor(), pen.getCompanyName(), pen.getPrice());
    }

    void updateViewQuantity() {
        penView.printQuantityDetails(pen.getQuantity());
    }

}
