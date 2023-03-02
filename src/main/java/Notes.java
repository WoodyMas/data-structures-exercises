public class Notes {

    public static void main(String[] args) {
        System.out.println("""
                Bubble Sort:
                Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order. It has a time complexity of O(n^2), which makes it less efficient than other sorting algorithms. Bubble sort is suitable for small datasets, but not recommended for large datasets.
                                
                Selection Sort:
                Selection Sort is another simple sorting algorithm that selects the smallest or largest element and places it in the appropriate position in the array. It has a time complexity of O(n^2), which makes it inefficient for large datasets. Selection sort is suitable for small datasets, but not recommended for large datasets.
                                
                Insertion Sort:
                Insertion Sort is a simple sorting algorithm that builds the final sorted array one item at a time. It has a time complexity of O(n^2), which makes it inefficient for large datasets. Insertion sort is suitable for small datasets, but not recommended for large datasets.
                                
                Merge Sort:
                Merge Sort is a divide-and-conquer sorting algorithm that splits the array into smaller sub-arrays, sorts them recursively, and then merges them back together. It has a time complexity of O(n log n), which makes it more efficient than the previous sorting algorithms. Merge sort is suitable for both small and large datasets.
                                
                Quick Sort:
                Quick Sort is another divide-and-conquer sorting algorithm that partitions the array into two smaller sub-arrays, sorts them recursively, and then combines them back together. It has a time complexity of O(n log n), which makes it more efficient than Bubble, Selection, and Insertion Sort. Quick Sort is suitable for both small and large datasets.
                                
                Heap Sort:
                Heap Sort is a comparison-based sorting algorithm that uses a binary heap data structure to sort the array. It has a time complexity of O(n log n), which makes it more efficient than Bubble, Selection, and Insertion Sort. Heap Sort is suitable for both small and large datasets.
                                
                Radix Sort:
                Radix Sort is a non-comparison sorting algorithm that sorts the array based on the digits of the elements. It has a time complexity of O(nk), where k is the number of digits in the largest element. Radix Sort is suitable for sorting integers or strings that have a fixed length.
                        
                        
                                
                """);
    }
}
