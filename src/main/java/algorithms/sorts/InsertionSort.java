package algorithms.sorts;

    class InsertionSort {

        public static void insertionSort(int[] array) {
           for (int i = 1; i < array.length; i++) {
               int temp = array[i];
               int j = i -1;

               while (j > -1 && temp < array[j]) {
                   array[j+1] = array[j];
                   array[j] = temp;
                   j--;
               }
           }
        }

        public InsertionSort(){}

        public InsertionSort(int[] array) {
            insertionSort(array);
        }

        public static void main(String[] args) {
            System.out.println("""
                    ///////////////////////////////
                            Insertion Sort
                    ///////////////////////////////
                    
                    Insertion sort always starts with the second item, and then is compared to the previous item. If it's less than its predecessor, it is switched. This continues and is subsequently switched as many times as it is less than its predecessors.
                    
                    ///////////////////////////////
                                Big O
                    ///////////////////////////////
                    
                    Insertion Sort has a nested for loop so as its worst case, it is O(N^2)
                    
                    but when an array is already almost sorted, it is a much more efficient tool to use O(N) than some of the more advanced sorting methods that will be discussed later
                    
                    """);
        }
    }
