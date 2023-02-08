package algorithms.sorts;

public class SelectionSort {

    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i+1; j< array.length; j++) {
                if (array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("""
                With Selection sort we will need all the indexes
                
                We start with the first item (index 0) and we look for the index that contains the lowest value
                
                we will set the value of index(0) to minIndex (a temporary value).
                
                We loop through the array and change index(1) to see if it's less than [0] and reassign minIndex to [1].
                
                We continue this until we determine which index has the minimum value
                
                When we find the true min val, we reassign the [0] index to the lowest.
                
                The operation will execute every time until there are no sorts left (as all indexes have been sorted)
                
                
                """);
    }
}
