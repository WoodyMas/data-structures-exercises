package trees;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();
        System.out.println("Root = " + myBST.root);

        myBST.insert(45);
        System.out.println("Root = " + (myBST.root).value);
        System.out.println(myBST.insert(45));
        System.out.println(myBST.insert(48));
        System.out.println(myBST.insert(77));
        System.out.println(myBST.insert(77));
        System.out.println(myBST.insert(12));
        System.out.println(myBST.insert(19));
        System.out.println(myBST.insert(33));
        System.out.println("Root = " + (myBST.root.right).value);
        System.out.println("Root = " + (myBST.root.left).value);
        System.out.println("Root = " + (myBST.root.right.right).value);

        System.out.println("Test contains method");

        System.out.println(myBST.contains(45));
        System.out.println(myBST.contains(48));
        System.out.println(myBST.contains(32));
        System.out.println(myBST.contains(33));




    } // end main method
} // End Main Class
