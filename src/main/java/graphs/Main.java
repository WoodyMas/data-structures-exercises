package graphs;

public class Main {

    public static void main(String[] args) {

        Graph myGraph = new Graph();

        System.out.println(myGraph.addVertex("A"));
        System.out.println(myGraph.addVertex("B"));
        System.out.println(myGraph.addVertex("C"));
        System.out.println(myGraph.addVertex("B"));

        myGraph.printGraph();

        System.out.println("Testing adding edge between AB, CB, and CE (false)");

        System.out.println(myGraph.addEdge("A", "B"));
        System.out.println(myGraph.addEdge("C", "B"));
        System.out.println(myGraph.addEdge("C", "e"));

        myGraph.printGraph();

        myGraph.removeEdge("B", "C");
        myGraph.printGraph();
        myGraph.addEdge("B", "C");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("A", "C");

        myGraph.printGraph();
        myGraph.removeEdge("A", "C");
        myGraph.removeEdge("C", "A");
        System.out.println(myGraph.removeEdge("C", "A"));
        System.out.println(myGraph.removeEdge("C", "A"));
        System.out.println(myGraph.removeEdge("C", "Zed"));
        myGraph.printGraph();

    }
}
