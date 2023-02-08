package algorithms.sorts;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {





        int[] myArr = {43, 23, 19, 47, 100};
        int[] myArr2 = {2, 1, 3, 7, 7, 8};
        int[] myArr3 = {90, 55, 42, 3, 3, 134};


        BubbleSort.bubbleSort(myArr);
//        SelectionSort.selectionSort(myArr3);/**/
//        InsertionSort.insertionSort(myArr2);



        System.out.println(Arrays.toString(myArr) + " myArr");
        System.out.println(Arrays.toString(myArr2) + " myArr2");
        System.out.println(Arrays.toString(myArr3) + " myArr3");


        System.out.println("Test sorting two arrays with Merge Sort: myArr + myArr3");

        System.out.println(Arrays.toString(MergeSort.merge(myArr, myArr3)));


        System.out.println(Arrays.toString(myArr2));
        System.out.println(Arrays.toString(MergeSort.mergeSort(myArr2)));
        System.out.println(Arrays.toString(myArr2));


    }
}
