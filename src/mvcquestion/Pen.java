package mvcquestion;

class Pen {

    private String name;
    private String color;
    private String companyName;
    private double price;

    static int quantity = 25;

    Pen() {

    }

    Pen(String name, String color, String companyName, double price) {

        this.name = name;
        this.color = color;
        this.companyName = companyName;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
