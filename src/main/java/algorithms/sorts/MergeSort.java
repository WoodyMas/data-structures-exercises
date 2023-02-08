package algorithms.sorts;

import java.util.Arrays;

public class MergeSort {

    public static int[] merge(int[] array1, int[] array2) {
        int[] combined = new int[array1.length + array2.length]; // new array with all items/indexes of array 1 and 2
        int index = 0; // this is index of new array: combined
        int i = 0; // iterate array1
        int j = 0; // iterate array2
        // If either of the arrays are empty, the while loop is broken
        while (i < array1.length && j <array2.length) {
            if (array1[i] < array2[j]) {
                combined[index] = array1[i];
                index++;
                i++;
            } else {
                combined[index] = array2[j];
                index++;
                j++;
            }
        }
            while (i < array1.length) {
                combined[index] = array1[i];
                index++;
                i++;
            }
            while (j < array2.length) {
                combined[index] = array2[j];
                index++;
                j++;
            }
            return combined;
    }

    public static int[] mergeSort(int[] array) {
        if (array.length == 1) return array;
        int midIndex = array.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));

        return merge(left, right);
    }

    public static void main(String[] args) {
        System.out.println("""
                Merge sort will be our first sorting algorithm that'll use recursion
                
                It leverages the idea that two sorted arrays can be easily merged together
                
                The Merge Sort will combine the array, and cut it in half. It'll keep cutting it in half until the array is single-item array.
                
                Then we can take each two items and sort those. From there we will take the new arrays and combine them with another pair of arrays and it'll keep running the sorting algorithm until it merges them altogether sorted.
                
                We will start with two sorted arrays which we will combine into one sorted array.
                
                For one array we will use i and for the other array we will use j. 
                
                We will compare i with j. Whichever is lowest we will push to the new "Combined" array.
                
                We will continue doing this (pushing i or j). If either array (i or j) loses all its items, this is the base case, meaning this is the condition that will break us out of recursion.
                
                Since i and j are already sorted, we can simply push the remainder of i or j array to combined.
                
                The merge method we created made it so that we can merge two different arrays together into a combined array, but we haven't yet made a method that will sort them using recursion
                
                Whenever one intends to implement recursion, we have to use it for the processes that will be repeating. We must also remember our base case:
                
                    What will be repeating in our Merge Sort method?
                    
                    1) It has to do the same thing over and over: Breaking arrays in half
                    2) Break case: When array.length is 1
                    3) Use merge() to put arrays together
 
 
                ////////////////////////////////
                        Big O Merge Sort
                ////////////////////////////////
                
                With Merge sort, you have doubled the size in memory. The space complexity is O(N). If you started with 8 items in the original array, you'd have created 8 new items by the end of the recursion
                
                Time complexity: In 8 items, it took us 3 steps. This is O(log N), but you still had to iterate through each item.
                
                Breaking it apart: O(log N)
                
                Putting it back together O(N)
                
                This is: O(n * log n). This is slightly worse than O(n^2)
                
                For sorting different types of data, O(n log n) is as good as it gets
                
                For most situations, this is a superior sorting method than the primitive ones, as it can handle larger volume of items to sort.
                
                """);
    }
}
