public class BigO {
    // omega denotes the best case
    // theta denotes the average case
    // worst case denotes omicron or "O"



    //// Constructor
    public BigO(){}

    public static void proportionalPrintItems(int n) {
        for (int i =0; i < n; i++){
            System.out.println(i);
        }

        System.out.printf("%nThis operation is O(n) because n is the argument and there were n operations executed. (In this case there were %s operations executed)%n", n);
        System.out.printf("%nIn this case, O(n) will always be proportional, because the number of operations won't exceed the argument");
    }


    public static void printItems(int n) {
        for (int i =0; i < n; i++){
            System.out.println(i);
        }

        for (int j = 0; j < n; j++) {
            System.out.println(j);
        }


        System.out.printf("%nIn this case we had n + n operations.");
        System.out.printf("%nWe passed 10 items and it ran 20 times (because of the two for loops)");
        System.out.printf("%nThis isn't to say we would notate this as O(2n), we always simplify by dropping Constants (We still notate this as O(n))");
    }

    public static void printNSquared(int n) {
        System.out.println("We are going to try to denote O(n^2)");
        System.out.println("This can be accomplished, in contrast to the double loop method, by using nested for-loops");
        System.out.printf("""
                public static void printNSquared(int n) {
                
                    for (int i = 0; i < n; i++) {
                        for(int j = 0; j < n; j++){
                            System.out.println(i + " " + j);
                            // See output
                        } // end for-loop j   
                    } // end for-loop i
                    
                } // End printNSquared
                """);
            for (int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++){
                    System.out.println(i + " " + j);
                    // See output
                } // end for-loop j
            } // end for-loop i
        System.out.printf("%nThis ran n * n operations. we chose %s to be the items to print, and the result was %s # of operations executed with the nested for-loop%n", n, (n*n));
        System.out.printf("%nEach addition of a nested loop will increase the operations executed by O(n^#nested)");
        System.out.printf("%nTo Simplify, we use the O(n^2) notation for all polynomial operation executions %n");
        System.out.printf("%n O(n^2) has less efficient time-complexity. Whenever a solution can be optimized to an O(n) it is usually much more efficient.%n");
    }


    public static void dropNonDominants(int n) {
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                System.out.println(i + " " + j);
            }
        }
        System.out.println("The first loop ran O(n^2) times (nested loop)");
        for(int k = 0; k < n; k++) {
            System.out.println(k + " " + n);
        }
        System.out.println("This next loop ran O(n) times (single loop)");
        System.out.printf("%nThe total number of operations is O(n^2 + n)%n");
        System.out.printf("%nAs n gets larger the O(n^2) grows much faster than O(n). For example, if we raised n to %s we would have %s operations in the O(n^2) as opposed to the standalone O(n) which would only have %s operations%n", (n*10), (Math.pow(n, 3)), (n*10));
        System.out.println("As the non-dominant O(n) becomes irrelevant, we drop O(n) for simplicity's sake. This is called 'Drop Non-Dominance'");
    }

    //      A new way to handle multiple iterators in a loop has joined the conversation!
    //        for(int k = 0, l = n; k < n && l >= 0; k++, l--) {
    //            System.out.println(k + " " + n + " " + l);
    //        }

    public static int addItems(int n) {
        System.out.println("\nThis is O(1). As n grows, the number of operations will stay the same.");
//        return n + n;
        System.out.println((n + n) + " O(1)");
        System.out.println("Below is an example of n + n + n, or O(2) because there are only two operations occurring after O(1)");
        System.out.println("This is still simplified to O(1) because the number of operations stays constant as n grows");
        System.out.println("O(1) is the most efficient of the other previously mentioned Os");
        return n + n + n;
    }

    // This specific example will only work with a sorted array
    public static void oLogN() {
        System.out.println("""
                #################################
                #################################
                
                You have a sorted array: {1, 2, 3, 4, 5, 6, 7, 8}
                Let's say we want to find 1. How can we go about doing this?
                We can consider using O(log n).
                We will be dividing the array into 2 every step
                By using Log we can find indexOf(1) in 3 steps. 
                
                2^3 = 8
                8 is the length of the Array. 2 is the amount we are dividing it into every time, and 3 are the number of times we have to divide it up to find indexOf(1)
                
                Another way of writing this in Log:
                
                log(sub 2, 8) = ???;
                `2 to the ??? power = 8?` The answer is 3. 2^3 = 8;
                
                log(sub 2, 8) = 3;
                """);

        System.out.println("Logarithms are exceptional at dealing with very large numbers");
        System.out.println("For example, let's say we want to do log(sub 2, 1073741824).");
        System.out.println("""
                Reminder, this is asking the question:
                
                "How many times can I divide 1073741824 by two to get one item?"
                The answer to this log question is 31.
                
                You can find any number in an array with over 1Billion items in it in 31 steps.
                """);
        System.out.println("O(log n) is the second most efficient sorting algorithm, next to O(n)\n#################################\n#################################");
    }

    public static void differentTermsForInputs(){
        System.out.println("""
                #################################
                #################################
                
                public static void printItems(int n) {
                    for (int i = 0; i < n; i++){
                        System.out.print(i);
                    }
                    for (int j = 0; j < n; j++){
                        System.out.print(i);
                    }
                }
                
                We would call this O(2n), or simply O(n), as there are two operations taking place on n ( O(n + n) )
                
                On the other hand, this isn't the same when there are two arguments. See below:
                
                public static void printItems(int n, int m) {
                    for (int i = 0; i < n; i++){
                        System.out.print(i);
                    }
                    for (int j = 0; j < m; j++){
                        System.out.print(i);
                    }
                }
                
                Why is this? It's because n and m might not be the same. The O description would then be
                
                O(n + m)
                
                Similarly, let's see what would happen if they were nested:
                
                public static void printItems(int n, int m) {
                    for (int i = 0; i < n; i++){
                        System.out.print(i);
                        for (int j = 0; j < m; j++){
                            System.out.print(i);
                        }
                    }
                }
                
                This would be described as:
                
                O(n * m);
                
                Pushing an item onto a Stack is O(1) and so is removing an item from a Queue. We commonly use ArrayLists for implementation with Stacks.
                
                #################################
                #################################
                """);
    }



//    public static int addItemsTest(int n) {
//        System.out.println("\n let's see if this n + n + n will work");
//        return addItems(n) + n;
//    }

    public static void main(String[] args) {
        int[] sortedArr = {1, 2, 3, 4, 5, 6, 7, 8};
//        proportionalPrintItems(10);
//        printItems(10);
//        printNSquared(10);
//        dropNonDominants(10);
        System.out.println(addItems(10));
//        System.out.println(addItemsTest(10));
        oLogN();
        differentTermsForInputs();
    }
}
