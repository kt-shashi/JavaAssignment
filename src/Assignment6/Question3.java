package Assignment6;

public class Question3 {
    public static void main(String[] args) {

        MyStack myStack = new MyStack();
        myStack.add(10);
        myStack.add(20);
        myStack.displayElement();
        System.out.println("Pop: " + myStack.remove());

        MyQueue myQueue = new MyQueue();
        myQueue.add(10);
        myQueue.add(20);
        myQueue.displayElement();
        System.out.println("Pop: " + myQueue.remove());

    }
}
