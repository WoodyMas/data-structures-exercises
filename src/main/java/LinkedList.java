public class LinkedList {

    private Node head;
    private Node tail;

    private Node temp;
    private int length;

    class Node {
        int value;
        Node next;
        Node previous;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(){};

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

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

    public void setHead(Node head) {
        this.head = head;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void setLength(int length) {
        this.length = length;
    }



    //// Append & Remove
    public void append(int value) {
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

    public void removeLast(Node node) {

        if (length <= 0) {
            System.out.println("Nothing left to remove");
        } else {
            System.out.println("TBD");
            tail.next = null;
            tail = node;
        }
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
//        tail = pre;
//        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;

    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
//        Node temp = head;
        if (length == 0) return null;
            Node temp = head;
            head = head.next;
            temp.next = null;
            length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
        }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;

    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        } else {
            System.out.println("A problem occurred. Your specified index may be out of the range of the LinkedList");
            return false;
        }
    }

    public boolean insert(int index, int value) {
        Node temp = get(index);
        Node newNode = new Node(value);
        if (temp != null) {
            if (index == 0) {
                prepend(value);
                return true;
            }
            if (index == length) {
                append(value);
                return true;
            }
            temp = get(index -1);
            newNode.next = temp.next;
            temp.next = newNode;
            length++;
            return true;

        } else {
            System.out.printf("%nYou cannot insert at index: %s because it is out of the range of the LinkedList", index);
            return false;
        }
    }

    public Node remove (int index) {
        if (get(index) == null) {
            System.out.printf("%nThe index specified: %s is outside of the range of the LinkedList", index);
            return null;
        }
        if (index == 0) return removeFirst();
        if (index == length-1) return removeLast();

        Node prev = get(index-1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;
        return  temp;
    }

    public void reverse() {
        if (length != 0) {
            Node temp = head;
            head = tail;
            tail = temp;
            Node after = temp.next;
            Node before = null;

            for (int i = 0; i < length; i++) {
                after = temp.next;
                temp.next = before;
                before = temp;
                temp = after;
            }
        } else {
            System.out.println("You may have tried to reverse an empty LinkedList");
        }

    }

    public void printReverse() {
        if (this.length != 0) {
            int j = length;
            System.out.printf("%n{");
            for (int i = this.length-1; i > 0; i--, j--) {
                System.out.printf("%s (%s), ", this.get(i).value, i);
            }
            System.out.printf("%s (%s)}%n", this.get(0).value, (j -1));
        } else {
            System.out.println("No LinkedList items to print");
        }
    }

    public void printAllIndex() {
//        System.out.println(this.length + " length");
        if (this.length != 0) {
            int j = 0;
            System.out.printf("{");
            for (int i = 0; i < this.length-1; i++, j++) {
                System.out.printf("%s (%s), ", this.get(i).value, i);
            }
            System.out.printf("%s (%s)}%n", this.get(length-1).value, j);
        } else {
            System.out.println("No LinkedList items to print");

        }

    }

}
