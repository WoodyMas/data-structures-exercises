public class LinkedLists {
    //// Instance Variables
    private Node head;
    private Node tail;
    private int length;

    //// Constructor
    public LinkedLists(){};

    // Create a new node
    public LinkedLists(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value) {
    // create new Node
    // add Node to end
    }

    public void prepend(int value) {
        // create a new Node
        // add node to beginning
    }

    public boolean insert(int index, int value) {
        // create new Node
        // insert Node
        return true;
    }


    public static void main(String[] args) {
        LinkedLists myLinkedList = new LinkedLists(4);

        System.out.printf("%nWe created a node with the value of %s and a length of %s%n", myLinkedList.head.getValue(), myLinkedList.length);

        System.out.println("""
                                
                An array list is the data structure a linked list is most commonly compared to because linked lists are dynamic in length just like array lists, whereas arrays are fixed in length.
                                
                linked lists don't have indexes that can be directly accessed, unlike array lists.
                                
                Another difference is that linked lists, unlike array lists are not saved in memory contiguously.
                                
                linked lists have a variable called "head" and one called "tail", which point to the first and last nodes respectively. Both of these variables are pointers that point to nodes, and each node has a pointer that points to the next node (and this repeats until it reaches the end).
                                
                Linked lists can be stored in different memory units where each node points to another node, whereas array lists are contiguous in memory and therefore have indexes that can access each specific item.
                                
                To look for a linked-list's index, each node must be iterated through even if you have a specified index. Unlike linked-lists, ArrayLists can be directly accessed via index and therefore don't need to be iterated as linked lists do. In this example, a linked-list is O(n) because it must perform iteration operations linearly and the arrayList is O(1) because the operation is completed in its first operation.
                                
                //////////////////////////////////////////////////////
                //////////////////////////////////////////////////////
                            Under the Hood
                //////////////////////////////////////////////////////
                //////////////////////////////////////////////////////
                                
                In a linked list, the node is both the value AND the pointer.
                                
                If we had a linked list with the following values: 11, 3, 23, 7, 4
                we could visualize this linking as a nested hashmap
                                
                {
                    "value"=11,
                    "next"={
                        "value"=3,
                        "next"={
                            "value"=23,
                            "next={
                                "value"=7,
                                "next"= {
                                    "value"=4,
                                    "next"=null
                                }
                            }
                        }
                    }
                }
                                
                In this example, we can think of the nodes as each {}, with the values being the value of "value" and the pointer being the subsequent link in "next"
                The very first node at the top would be set to head and the last would be set to tail, in this visualization.
                                
                                
                "head"= {
                    "value"=11,
                    "next"={
                        "value"=3,
                        "next"={
                            "value"=23,
                            "next={
                                "value"=7,
                                "next"= {
                "tail"=             "value"=4,
                                    "next"=null
                                }
                            }
                        }
                    }
                }
                                
                /////////////////////////////////////////
                /////////////////////////////////////////
                
                Constructor Notes:
                                
                    public LinkedLists(int value){
                        // Create a new node
                    }
                                
                    public void append(int value) {
                        // create new Node
                        // add Node to end
                    }
                                
                    public void prepend(int value) {
                        // create a new Node
                        // add node to beginning
                    }
                                
                    public boolean insert(int index, int value) {
                        // create new Node
                        // insert Node
                        return true;
                    }
                                
                    Notice how each of these methods create new nodes. Instead of writing code that creates new nodes in each method, we can create a class called Node that's primary constructor executes this method.     
                """);
    }
}
