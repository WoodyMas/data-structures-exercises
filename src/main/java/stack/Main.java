package stack;

public class Main {

    public static void main(String[] args) {
        Stack myStack = new Stack(2);
        // myStack.getTop();
        // myStack.getHeight();

        myStack.printStack();

        System.out.println("Push a new stack item");
        myStack.push(1);
        myStack.printStack();
    }
}
