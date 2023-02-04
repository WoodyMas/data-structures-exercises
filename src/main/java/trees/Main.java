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


    } // end main method
} // End Main Class
