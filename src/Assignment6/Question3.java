package Assignment6;

public class Question3 {
    public static void main(String[] args) {

        MyStack myStack = new MyStack();
        myStack.add(10);
        myStack.add(20);
        myStack.add(30);
        myStack.add(40);
        myStack.displayElement();
        System.out.println("Pop: " + myStack.remove());

        MyQueue myQueue = new MyQueue();
        myQueue.add(10);
        myQueue.add(20);
        myQueue.add(30);
        myQueue.add(40);
        myQueue.displayElement();
        System.out.println("Pop: " + myQueue.remove());

    }
}
