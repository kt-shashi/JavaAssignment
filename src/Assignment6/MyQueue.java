package Assignment6;

public class MyQueue implements LinearDS {

    int front, rear;
    int q[] = new int[MAXSIZE];

    MyQueue() {
        front = -1;
        rear = -1;
    }

    @Override
    public void add(int data) {
        if (rear == MAXSIZE - 1) {
            System.out.println("Queue Overflow ");
        }

        if (front == -1)
            front = 0;

        q[++rear] = data;

    }

    @Override
    public int remove() {

        if (front == -1) {
            System.out.println("Queue underflow");
            return Integer.MIN_VALUE;
        }

        return q[front++];
    }

    @Override
    public void displayElement() {
        for (int i = front; i <= rear; i++)
            System.out.print(q[i] + " ");
        System.out.println();
    }
}
