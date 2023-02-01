public class DoublyLinkedLists {

    //// Instance variables
    private Node head;
    private Node tail;
    private int length;

    //// Constructors
    // No args constructor
    public DoublyLinkedLists(){};

    // Constructor for Node with first Node value set
    public DoublyLinkedLists(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    };

    class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;
        }
    } // End Node class

    //// Getters & Setters

    public void getHeadPrint(){
        System.out.println("Head: " + head.value);
    }

    public void getTailPrint() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLengthPrint() {
        System.out.println("Length: " + length);
    }

    public void printListDLL(){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        // If there are no nodes in DLL
        // return null
        if (length == 0) {
            System.out.println("No nodes to remove");
            return null;
        };
            Node temp = tail;
            // If there's only one node
            if (length == 1) {
                // change head and tail to null
                head = null;
                tail = null;
            } // Otherwise
            else {
                // tail pointer assigned to previous node
                tail = tail.prev;
                // tail next pointer assigned null value
                tail.next = null;
                // temp previous val assigned null val
                temp.prev = null;
            }
            // DLL # of items decreases by one
            length--;
            // return temp (dll without last removed item)
            return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public static void main(String[] args) {
        System.out.println("""
                a single linkedList Node can be compared to a hashmap, whereas a doubly linked list Node contains a previous pointer not just next
                    for example:
                    
                    class Node{
                        int value;
                        Node next;
                        Node prev;
                        
                        Node(int value){
                            this.value = value;
                        }
                    }
                
                """);
    }
}
