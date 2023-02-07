package trees;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();
//        RecursiveBinarySearchTree myRBST = new RecursiveBinarySearchTree();
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
        System.out.println("Test false?");
        System.out.println(myBST.contains(33));


        System.out.println("\nTesting Recursive on myBST");
        System.out.println(myBST.rContains(32));
        System.out.println(myBST.rContains(70));
        System.out.println(myBST.rContains(33));


        BinarySearchTree myRBST = new BinarySearchTree();

        System.out.println("Test myRBST contains when null");
        System.out.println(myRBST.rContains(34));
        myRBST.rInsert(2);
        myRBST.rInsert(1);
        myRBST.rInsert(3);

        System.out.println(myRBST.root.value);
        System.out.println(myRBST.root.left.value);
        System.out.println(myRBST.root.right.value);
//        System.out.println(myRBST.root.right.value);

        System.out.println("Find minimum value for myMinBST root & root.right");
        BinarySearchTree myMinBST = new BinarySearchTree();

        myMinBST.rInsert(23);
        myMinBST.rInsert(43);
        myMinBST.rInsert(57);
        myMinBST.rInsert(9);

        System.out.println(myBST.minValue(myMinBST.root));
        System.out.println(myBST.minValue(myMinBST.root.right));


    } // end main method
} // End Main Class
