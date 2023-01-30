
public class Main {
// THIS GOES IN YOUR MAIN CLASS TO TEST YOUR CODE:
// -----------------------------------------------


    public static void main(String[] args) {

//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();

//        System.out.println("\nLinked List:");
//        myLinkedList.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 4
            Tail: 4
            Length: 1

            Linked List:
            4

        */
        LinkedList myLinkedList = new LinkedList(4);
        LinkedList newLinkedList = new LinkedList(4);
        newLinkedList.append(2);
        myLinkedList.append(7);
        myLinkedList.append(14);
        myLinkedList.append(24);
        myLinkedList.append(10);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.printList();

        System.out.println();
//        System.out.println(myLinkedList.removeLast());
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        System.out.println();
        myLinkedList.printList();
        System.out.println();

        System.out.println(newLinkedList.removeLast().value);
        System.out.println(newLinkedList.removeLast().value);
//        System.out.println(newLinkedList.removeLast().value);

    }

}

