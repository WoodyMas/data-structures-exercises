package recursion;

public class Recursion {

    public static int factorial(int value) {
        if (value == 1) return 1;
//        System.out.printf("%s!", value);
        return value * factorial(value-1);
    }

    public static void methodThree(){
        System.out.println("Three");
    }
    public static void methodTwo(){
        methodThree();
        System.out.println("Two");
    }
    public static void methodOne(){
        methodTwo();
        System.out.println("One");
    }


    public static void main(String[] args) {
        System.out.println("""
                A good unofficial definition for recursion is: A function that calls on itself until it doesn't
                
                When you have a situation where you get to the condition that stops the method from continuing to calling itself, this is called a "Base Case"
                
                Otherwise when you have a situation where the method is going to call itself again, this is called a "Recursive Case"
                
                When no condition is present to stop a recursive case, the operation will continue to run indefinitely. This is called a "Stack Overflow"
                
                If you get a stack overflow, the conditional statement will be one of the first places to visit and troubleshoot
                
                ////////////////////////////////////////
                            Call Stack
                ////////////////////////////////////////
                
                To understand recursion, we must understand the Call Stack because everytime we call something recursively we're putting a new method on the call stack
                
                we can liken a call stack to a can of tennis balls (as we likened a stack). Only when a call stack is done running can the next method run.
                
                
                Each time the method is calling itself, it's creating a new instance of a method and adding that to the callstack.
                
                
                
                """);

        methodOne();
        System.out.println(factorial(4));
    }
}
