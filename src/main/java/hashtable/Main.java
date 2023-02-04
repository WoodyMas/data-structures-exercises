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

        System.out.println("Testing keys() method\n");
        myHashTable.set("paint", 20);
//        myHashTable.set("Linoleum", 65);
        System.out.println(myHashTable.keys());

        System.out.println("Testing more efficient array comparatives\n");

        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};

        System.out.println(HashTable.itemInCommonIneff(array1, array2));
        System.out.println(HashTable.itemInCommonON(array1, array2));

    }
}
