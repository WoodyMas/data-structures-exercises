package hashtable;

import stack.Node;

public class HashTable {

    public int size = 7;
    private Node[] dataMap;

    public HashTable() {
        dataMap = new  Node[size];
    }

    class Node {
        private String key;
        private int value;
        private Node next;

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public void printTable() {
        for (int i= 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.printf("%n {%s= '%d'}%n", temp.key, temp.value);
                temp = temp.next;
            }
        }
    }

    // private because hash method will only be used by other methods in the HashTable class
    private int hash(String key) {
        // hash int will be declared & initialized @ 0
        int hash = 0;

        char[] keyChars = key.toCharArray();
        for (int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i];
            // we'll multiply by a prime number so that it's more random
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

    public static void main(String[] args) {
        System.out.println("""
                We'll create an array with key valued pairs
                the key is the name. Each letter has an ascii letter value
                
                {"nails"= 1000}
                nails is the key and 1000 is the value. The ascii letter values will be run through a hash
                
                this will be an address which will be stored as an index in the array.
                
                This is a one way access from key => address not the other way around.
                This hash method is also deterministic meaning every time nails is run, it will always get the same address (2)
                
                A collision is when you get the same address assigned to another value. We want to keep both, rather than overwriting one.
                
                We will need a way to going through all of the keys at a particular index and returning the value of a specific key
                
                ////////////////////////////////////////////////////
                                Collisions
                ////////////////////////////////////////////////////
                
                Separate Chaining is when you put the next key value pair at the same address even if there's already one there. (what we just talked about)
                
                Linear Probing is when you put an item in the next open spot (index) instead of loading multiple into the same address. It is one of the types of open addressing. This and Separate Chaining is one of the most common ways to deal with collisions.
                
                We will use Separate Chaining, by creating a linked list at each index where multiple keys are stored in a same address
                
                If our address space has a prime number of addresses, we will deal with less collisions
                
                """);
    }
}
