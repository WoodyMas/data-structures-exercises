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
                                
                Quick sort follows the divide-and-conquer approach. It works by selecting a "pivot" element from the array and partitioning the other elements into two sub-arrays, according to whether they are less than or greater than the pivot. The sub-arrays are then recursively sorted.
                                
                Here are the steps for Quick sort:
                                
                Choose a pivot element from the array. This can be any element, but it is commonly the first or the last element in the array.
                                
                Reorder the array so that all elements with values less than the pivot come before the pivot, while all elements with values greater than the pivot come after it (equal values can go either way).
                                
                Recursively apply the above two steps to the sub-array of elements with smaller values and separately to the sub-array of elements with greater values.
                                
                The base case of the recursion is when sub-arrays of size zero or one are reached, in which case they are already sorted.
                                
                Finally, the sub-arrays are combined to form the final sorted array.
                                
                Quick sort has an average case time complexity of O(nlogn), which is generally faster than other commonly used sorting algorithms such as bubble sort, insertion sort, and selection sort. However, in the worst case scenario, the time complexity can be O(n^2), which can make it slower than some other algorithms.
                            
                
                                
                """);
    }
}
