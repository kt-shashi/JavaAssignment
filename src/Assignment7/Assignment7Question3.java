package Assignment7;// Shashi Kant
// 2021pgcaca050

class Inventory {

    int stock;

    Inventory() {
        stock = 0;
    }

    synchronized void addFromStock() {
        if (stock > 20) {
            System.out.println("Overflow");
        }
        System.out.println("Added to stock, Updated stock:" + (stock++));
    }

    synchronized void removeFromStock() {
        if (stock < 0) {
            System.out.println("Underflow");
        }
        System.out.println("Remove to stock, Updated stock: " + (--stock));
    }
}

class Add implements Runnable {
    Thread t;
    int n;
    String s;
    Inventory inventory;

    Add(int n, Inventory inventory) {
        t = new Thread(this, "Add thread");
        this.n = n;
        this.inventory = inventory;
        t.start();
    }

    @Override
    public void run() {

        for (int i = 0; i < n; i++) {
            inventory.addFromStock();
        }

    }
}

class Remove implements Runnable {
    Thread t;
    int n;
    String s;
    Inventory inventory;

    Remove(int n, Inventory inventory) {
        t = new Thread(this, "Remove thread");
        this.n = n;
        this.inventory = inventory;
        t.start();
    }

    @Override
    public void run() {

        for (int i = 0; i < n; i++) {
            inventory.removeFromStock();
        }

    }
}

class Assignment7Question3 {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        new Add(20, inventory);
        new Remove(20, inventory);

    }

}
