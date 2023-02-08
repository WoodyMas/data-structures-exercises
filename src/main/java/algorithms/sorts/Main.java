package algorithms.sorts;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {



        int[] myArr = {43, 23, 19, 47, 100};
        int[] myArr3 = {90, 55, 42, 3, 3, 134};
        BubbleSort.bubbleSort(myArr);
        SelectionSort.selectionSort(myArr3);


        System.out.println(Arrays.toString(myArr));
        System.out.println(Arrays.toString(myArr3));

    }
}
