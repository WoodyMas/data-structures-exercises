public class CheekyDiscoveries {
    public static void doubleIterator(int[] arrayOfIntegers){
        for(int i = 0, j = arrayOfIntegers.length; i < arrayOfIntegers.length && j > 0; i++, j--) {
            System.out.println(i + " " + j + " ");
        }
    }

    //      A new way to handle multiple iterators in a loop has joined the conversation!
    //        for(int k = 0, l = n; k < n && l >= 0; k++, l--) {
    //            System.out.println(k + " " + n + " " + l);
    //        }
    public static void main(String[] args) {
        int[] aWholeNewArray = {1, 4, 55, 78, 12, 32, 13, 9};
        doubleIterator(aWholeNewArray);
    }
}
