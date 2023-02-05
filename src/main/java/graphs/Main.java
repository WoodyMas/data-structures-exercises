package graphs;

public class Main {

    public static void main(String[] args) {

        Graph myGraph = new Graph();

        System.out.println(myGraph.addVertex("A"));
        System.out.println(myGraph.addVertex("B"));
        System.out.println(myGraph.addVertex("C"));
        System.out.println(myGraph.addVertex("B"));

        myGraph.printGraph();

    }
}
