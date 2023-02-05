package graphs;

public class Graph {

    public static void main(String[] args) {
        System.out.println("""
                We call nodes vertex/vertices in graphs (but you may hear people call them nodes).
                
                The proper term for a connection between vertices would be called an Edge or a Connection (but edge is the more proper term).
                
                A vertex can have an edge with any vertex (There's no limit to how many vertices can be connected with other vertices).
                
                To traverse from one vertex to another, we want to select the direct route (one hop).
                
                We can have weighted edges (For example, in Google maps you may be directed to a less direct route if the more direct route has a lot of traffic)
                
                With network routing protocols, it would be better to have an extra router hop with two extra links than to have a direct link with a very slow link.
                
                Another example: In facebook you are friends with a friend. This is a bidirectional relationship because your friend is also friends with you. On the other hand, if you follow a celebrity, they don't follow you back. This is directional.
                
                Trees are also graphs, but they have the limitation that each node can only point to two other nodes. Linked lists are also a form of a tree, therefore linked lists are a form of a graph with the limitation that they can only point to one other node.
                
                We typically think of graphs having much more complex relationships, mixing directional, bidirectional, and multi-directional relationships.
                
                
                //////////////////////////////////////////////////
                        Adjacency Matrix
                //////////////////////////////////////////////////
                
                With an Adjacency Matrix, we are plotting 1s and Os to show whether a vertex has an edge (connection) with a specific node. If it is listed as 1, it does, if 0 it does not.
                
                The starting column shows the actual vertex, and the horizontal axis shows the items the specified axis has an edge with.
                
                If an edge is weighted, the weights will be stored in the matrix instead of having 1s.
                
                For example, if an edge is weighted from Vertex A to Vertex B with a value of 15 (bidirectionally), then A- B and B- A will have the value 15 in the matrix as opposed to 1.
                
                """);
    }
}
