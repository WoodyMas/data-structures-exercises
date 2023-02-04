package hashtable;

public class Main {

    public static void main(String[] args) {

        HashTable myHashTable = new HashTable();

        myHashTable.printTable();
        System.out.println("\n");

        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);

        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 140);

        myHashTable.printTable();
        System.out.println("\n");

        System.out.println(myHashTable.get("screws"));
        System.out.println(myHashTable.get("nails"));
        System.out.println(myHashTable.get("tile"));
        System.out.println(myHashTable.get("lumber"));

        System.out.println(myHashTable.get("wrong key"));

    }
}
