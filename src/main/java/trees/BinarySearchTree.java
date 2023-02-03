package trees;

public class BinarySearchTree {
    //// instance variables
    Node root;

    class Node {
        int value;
        Node left;
        Node right;

        private Node(int value) {
            this.value = value;
        }

    } // Node Constructor

    public void insert(int value){
        // create newNode
        // check if root == null, and if so root = newNode
        // temp (temporary value) = root (temp equals root value)
        // while loop (because we don't know how long this loop will need to last
        // if newNode (which is equal to root value) == temp return false
        // if newNode < insert left else insert right
        // if null insert newNode else move to next
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
