package hashtable;

public class HashTable {

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
                
                """);
    }
}
