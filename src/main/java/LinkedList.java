public class LinkedList {
    //// Instance Variables
    //    private int value;
    private Node head;
    private Node tail;
    private int length;

    // CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE //
    public LinkedList(){}
    public LinkedList(int value){
//        this.value = value;
        head = new Node(value);
        tail = new Node(value);
        length = 1;
    }


    //////////////////////////////////////////////////////////////


    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void appendNode(int value) {
         Node newNode = new Node(value);
         if (length == 0) {
             head = newNode;
             tail = newNode;
         } else {
             tail.next = newNode;
             tail = newNode;
         }
         length++;
    }
}
