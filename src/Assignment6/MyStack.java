package Assignment6;

public class MyStack implements LinearDS {

    int top;
    int s[] = new int[MAXSIZE];

    MyStack() {
        top = -1;
    }

    @Override
    public void add(int data) {
        if (top == MAXSIZE - 1) {
            System.out.println("Stack overflow");
            return;
        }

        s[++top] = data;
    }

    @Override
    public int remove() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return Integer.MIN_VALUE;
        }

        return s[top--];
    }

    @Override
    public void displayElement() {
        for (int i = 0; i <= top; i++)
            System.out.print(s[i] + " ");
        System.out.println();
    }
}
