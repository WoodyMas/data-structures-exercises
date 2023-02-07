package basic_sorts;

public class BubbleSort {

    public static void main(String[] args) {
        System.out.println("""
                The bubble sort is one of the more primitive sorting methods.
                
                It is also probably the easiest sorting method we will create here
                
                We start with the first item. we compare it to the second item, and if it's bigger, we switch them.
                
                Then we compare the second to the third. If it's bigger we switch.
                
                We do this until there are no more comparisons for the index. This index has just been sorted.
                
                Then we start over for the remaining indexes, but each time is shorter.
                
                """);
    }
}
