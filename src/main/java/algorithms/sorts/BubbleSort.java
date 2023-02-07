package algorithms.sorts;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        // cycle through the array in reverse order until i is less than or equal to 0
        for (int i = array.length -1; i > 0; i--) {
            // cycle through the array from the beginning index
            for (int j = 0; j < i; j++) {
                // if the index is greater than the following index
                if (array[j] > array[j+1]){
                    // store the following index in a temporary variable
                    int temp = array[j];
                    // change the previous index to the following index's value (the lesser value switches to the previous index)
                    array[j] = array[j+1];
                    // change the following index to the temporary value (the larger value)
                    array[j+1] = temp;
                }
            }
        }
    }

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
