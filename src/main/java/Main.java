
public class Main {
// THIS GOES IN YOUR MAIN CLASS TO TEST YOUR CODE:
// -----------------------------------------------


    public static void main(String[] args) {

        LinkedList prependLinkedList = new LinkedList(2);
        prependLinkedList.append(3);
        prependLinkedList.append(3);
        prependLinkedList.append(5);
        prependLinkedList.printList();
        System.out.println();
        prependLinkedList.prepend(1);
        prependLinkedList.printList();
        prependLinkedList.removeLast();

        System.out.println("remove last");

        prependLinkedList.printList();
        System.out.println("remove first");

        LinkedList removeFirst = new LinkedList(2);
        removeFirst.append(1);

        System.out.println(removeFirst.removeFirst().value);
        System.out.println(removeFirst.removeFirst().value);
        System.out.println(removeFirst.removeFirst());



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
//        LinkedList myLinkedList = new LinkedList(4);
//        LinkedList newLinkedList = new LinkedList(4);
//        newLinkedList.append(2);
//        myLinkedList.append(7);
//        myLinkedList.append(14);
//        myLinkedList.append(24);
//        myLinkedList.append(10);
//
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
//
//        myLinkedList.printList();
//
//        System.out.println();
////        System.out.println(myLinkedList.removeLast());
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
//        System.out.println();
//        myLinkedList.printList();
//        System.out.println();
//
//        System.out.println(newLinkedList.removeLast().value);
//        System.out.println(newLinkedList.removeLast().value);
////        System.out.println(newLinkedList.removeLast().value);

    }

}

