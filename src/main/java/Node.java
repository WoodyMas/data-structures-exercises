public class Node {
    public int value;
    public Node next;
    public Node previous;

    //// Constructor
    public Node(){}

//    public Node(int value){
//        this.value = value;
//        Node next;
////        Node(int value) {
////            this.value = value;
////        }
//    }

    public Node(int value) {
        this.value = value;

    }

    //// Getters and setters

    public int getValue(){
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }


}
