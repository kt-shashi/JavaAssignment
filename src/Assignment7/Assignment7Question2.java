package Assignment7;// Shashi Kant
// 2021pgcaca050

class PrintClass implements Runnable {

    Thread t;
    int n;
    String s;

    PrintClass(int priority, int n) {
        t = new Thread(this, "Print Thread " + n);
        t.setPriority(priority);
        t.start();

        this.n = n;

    }

    @Override
    public void run() {

        for (int i = 1; i <= n; i++)
            System.out.println(t.getName() + " " + i);

    }
}

public class Assignment7Question2 {

    public static void main(String[] args) {
        new PrintClass(5, 100);
        new PrintClass(10, 50);
    }

}
