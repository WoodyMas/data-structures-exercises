public class DoublyLinkedLists {

    //// Instance variables
    private Node head;
    private Node tail;
    private int length;

    private int index;

    private boolean indexCheck(int index){
      if(index < 0 || index > length) {
          System.out.println("bad index");
          return false;
      } else {
          return true;
      }

    }


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
        if (length == 0) System.out.println("No nodes to print :(");
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

    public Node removeFirst() {
        if (length == 0) {
            System.out.println("Nothing to remove");
            return null;
        }
        Node temp = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node get(int index) {
        if (indexCheck(index)) {
        Node temp = head;
        if (index < length/2) {
            for (int i = 0; i < index; i++) {
                //System.out.printf("%nStarting from index: %s%n", i);
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length -1; i > index; i--) {
                //System.out.printf("%nStarting from index: %s%n", i);
                temp = temp.prev;
            }
        }
            return temp;
        } else {
            return null;
        }
    }

    public Node set(int index, int value) {
        if (!indexCheck(index)) {
            System.out.println("The index specified is outside the range of the DLL");
            return null;
        } else {
            Node temp = get(index);
            temp.value = value;
            return temp;
        }

    }

    public boolean boolSet(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (!indexCheck(index)) return false;

        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = get(index-1);
        Node after = before.next;
        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;
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
