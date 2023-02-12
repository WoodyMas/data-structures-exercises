package algorithms.sorts;

public class QuickSort {

    public static void main(String[] args) {
        System.out.println("""
                When quick sorting an array, you have a pivot point (we'll use the first item), and we'll compare every item in the array to the pivot point.
                
                Arr = {4, 6, 1, 7, 3, 2, 5}
                
                We will start by comparing the 6 to the 4 (4 is the pivot point). We keep 6 in its place
                the 1 is less than 4, so we  exchange the first item that is greater (6)
                
                Pivot:
                
                Like merge() being a helper function for mergeSort(), pivot() will be a helper function for quickSort()
                
                the pivot function will take an item, will sort each item until the pivot is in its sorted position
                
                
                
                """);
    }
}
