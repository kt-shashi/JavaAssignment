package mvcwala;

public class PenController {

    Pen pen;
    PenView penView;

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
        penView.printPenDetails();
    }

    void updateViewQuantity() {
        penView.printQuantityDetails();
    }

}
