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

        System.out.println("Test myStack.pop()");
        System.out.println(myStack.pop().value);
        System.out.println("It returned the first index as desired, but let's see if myStack actually has lost the first index");
        myStack.printStack();
        System.out.println("It works");
    }
}
