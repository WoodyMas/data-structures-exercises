package trees;

public class BinarySearchTree {
    //// instance variables
    public Node root;

    class Node {
        int value;
        Node left;
        Node right;

        private Node(int value) {
            this.value = value;
        }

    } // Node Constructor

    public boolean insert(int value){
        // create newNode
        Node newNode = new Node(value);
        // check if root == null, and if so root = newNode
        if (root == null) {
            root = newNode;
            return true;
        }
        // temp (temporary value) = root (temp equals root value)
        Node temp = root;
        // while loop (because we don't know how long this loop will need to last
        while (true) {
            // if newNode (which is equal to root value) == temp return false
            if (newNode.value == temp.value) {
                System.out.println("Entered value may already be in this Binary Search Tree");
                return false;
            }
                // If newNode is less than temp
                if (newNode.value < temp.value) {
                    // Check if temp left is null or not. if it is:
                    if (temp.left == null) {
                        // left pointer assigned to newNode value
                        temp.left = newNode;
                        // return true because a successful insertion is possible
                        return true;
                    }
                    // temp takes the value of temp.left
                    temp = temp.left;
                } else {
                    // if temp is greater than newNode
                    // Check if temp.right is null
                    if (temp.right == null) {
                        // temp.right takes newNode's value
                        temp.right = newNode;
                        // return true because a successful insertion is possible
                        return true;
                    }
                    // temp is assigned to temp.right's value
                    temp = temp.right;
                }
            }
        }

        // Contains method
        // look for a number in a tree
        // return true if it's in tree
        // return false if it's not in tree

//    public boolean containsMW(int value) {
//        if (root == null) {
//            System.out.println("No value present in tree");
//            return false;
//        } else {
//            Node newNode = new Node(value);
//            Node temp = root;
//            // Check if root value is equal to inserted value
//            if (temp.value == newNode.value) {
//                System.out.println("Contained at root");
//                return true;
//            }
//            // Check to see if temp (root) is greater than input
//            if (temp.value > newNode.value) {
//                // This will be the condition used to evaluate left side
//                // This will be more complicated than I thought.
//            }
//        }
//
//    }

    // See if a number is contained in a tree. If it is, return true, otherwise return false
    // if root == null return false
    // create a temp variable: temp = root
    // use a while loop to move through the tree
    // if input is less than a node value, move left.
    // if compared node value is null, we break out of the loop by returning false
    // while (temp != null)

    public boolean contains(int value){
//        if (root == null) {
//            System.out.println("No values in tree");
//            return false;
//        }
        Node temp = root;
        while (temp!= null){
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                System.out.printf("%n%s is contained in this BST: ", value);
                return true;
            }
        }
        System.out.printf("%n%s is contained in this BST: ", value);
        return false;
    }

    public static void main(String[] args) {
        System.out.println("""
                //////////////////////////////////////////////////////////////////
                //////////////////////////// Binary Trees ///////////////////////
                
                A tree is similar to a linked list except trees fork, whereas linked lists don't.
                
                Instead of a node pointing to next/previous it will point to left vs right.
                
                In a binary tree, each node can only point to two nodes, but other types of trees can point to a number of nodes. Each subsequent node in a BST can point to two nodes as well.
                
                In a full Binary Tree a node only points to zero nodes or two nodes. If all parent nodes contain two or zero nodes, it is called full.
                
                A "perfect" tree has any nodes that are filled all the way across. A complete tree is a filled tree from left to right with no gaps
                
                A perfect tree means each node contains the amount of nodes required (A Binary Tree will have each node contain two nodes).
                
                If a node has more than one parent it isn't a tree. Child nodes can be parent nodes of other subsequent nodes. 
                
                If a node doesn't have a child it's called a leaf.
                
                //////////////////////////////////////////////////////////////////
                /////////////////////// Binary Search Trees //////////////////////
                
                A binary tree is different to a binary search tree (BST)
                
                BSTs require smaller value nodes to be put in the left of the node that is greater.
                
                
                ////
                
                When constructing a BST, every node needs something pointing to it or it'll be garbage collected. When we had the Linked list, we used the instance property "head" to point to the first node. We'll do something similar but instead of calling it "head" we'll call it "root"
                
                
                
                
                """);
    }
}
