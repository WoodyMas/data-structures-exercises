import java.util.HashMap;

public class ClassesAndPointers {
    public String color;



    //// Constructors
    public ClassesAndPointers(){};

    public ClassesAndPointers(String color) {
        this.color = color;
    };

    //// Getters and setters
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {

        ClassesAndPointers classesAndPointersOne = new ClassesAndPointers("green");
        ClassesAndPointers classesAndPointersTwo = new ClassesAndPointers("blue");
        System.out.println("I already understand instances and class constructors but I'm following along with Udemy");

        System.out.println(classesAndPointersOne.getColor());
        System.out.println(classesAndPointersTwo.getColor());

        int num1 = 11;
        int num2 = num1;
        num1 = 22;

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        HashMap<String, Integer> map3 = new HashMap<>();

        map1.put("value", 11);
        map2 = map1;

        System.out.println(map1);
        System.out.println(map2);

        map1.put("value", 22);
        System.out.println(map1);
        System.out.println(map2);

        System.out.println("Reassigning of values may cause unused pre-set initialization values to be 'collected' (garbage collection)");

    }
}
