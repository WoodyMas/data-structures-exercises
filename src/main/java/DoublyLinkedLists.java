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
