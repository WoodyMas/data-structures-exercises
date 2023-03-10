package hashtable;

import stack.Node;

import java.util.ArrayList;
import java.util.HashMap;

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
            System.out.println(i + ": ");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.printf("{%s= '%d'}%n", temp.key, temp.value);
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

    public void set(String key, int value) {
        // must determine index where key value pair will go
        int index = hash(key);

        Node newNode = new Node(key, value);
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int get(String key) {
      // we intend to return the index of a specified key
      int index = hash(key);
      Node temp = dataMap[index];
      while (temp != null) {
          if (temp.key == key) return temp.value;
          temp = temp.next;
      }
      System.out.println("Not found");
      return 0;
    }

    public ArrayList keys() {
        ArrayList<String> allKeys = new ArrayList<>();
        for (int i = 0; i < dataMap.length; i++) {
            Node temp = dataMap[i];
            while (temp != null) {
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }

    // Inefficient solution using nested loops: O(n^2)
    public static boolean itemInCommonIneff (int[] array1, int[] array2) {
        for (int i : array1) {
            for (int j : array2){
                if (i == j) return true;
            }
        }
        return false;
    }

    public static boolean itemInCommonON(int[] arr1, int[] arr2) {
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();
        for (int i : arr1) {
            myHashMap.put(i, true);
        }
        for (int j : arr2) {
            if (myHashMap.get(j) != null) return true;
        }
        return false;
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
                
                ////////////////////////////////////////////////////
                                Big O
                ////////////////////////////////////////////////////
                
                Because this method has to be run everytime we add or get a method, we have to determine the Big O. The hash method alone is O(1) because it'll go through the same number of operations to determine a hash regardless of the number of items that are already in the hash table;
                
                if we set an item, we run it through the hash method and it gives us an index. Adding that would be considered O(1). 
                
                if we have to get an item that has a large address space with randomized item placement, we treat getting and setting an item as O(1).
                
                
                """);
    }
}
