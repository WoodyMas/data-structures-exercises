package queue;

public class Main {

    public static void main(String[] args) {
        Queue myQueue = new Queue(7);
        Queue nullQueue = new Queue();

        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        myQueue.printQueue();

        System.out.println();

        myQueue.enqueue(5);
        myQueue.enqueue(    15);
        myQueue.printQueue();


        System.out.println();
        nullQueue.printQueue();
        nullQueue.getLength();
        System.out.println();
        nullQueue.enqueue(5);
        nullQueue.printQueue();

        System.out.println(nullQueue.dequeue().value);
        nullQueue.printQueue();
        nullQueue.dequeue();
        System.out.println();
        nullQueue.enqueue(3);
        nullQueue.enqueue(35);
        nullQueue.enqueue(24);
        nullQueue.printQueue();
        System.out.println();
        nullQueue.dequeue();
        nullQueue.printQueue();
        System.out.println();
        nullQueue.dequeue();
        nullQueue.dequeue();
        nullQueue.printQueue();


    }
}
