package stack;

public class Stack {
    //// Instance Variables
    private Node top;
    private int height;

    //// Constructors
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
    // No args
    public Stack(){}

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void printStack(){
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    //// Methods, Getters & Setters
    public void getTop(){
        System.out.println("Top: " + top.value);
    }
    public void getHeight(){
        System.out.println("Height: " + height);
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }
}
