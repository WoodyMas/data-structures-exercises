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
                
                //////////////////////////////////////////////////
                        Adjacency List
                //////////////////////////////////////////////////
                
                An adjacency list is another way of representing a graph. We use a hashmap to represent this. 
                
                Where a vertex has an edge with another vertex, we will represent these as a key value pair:
                    for example:
                    
                {
                    "A"=["B","E"],
                    "B"=["A","C"],
                    "C"=["B","D"],
                    "D"=["C","E"],
                    "E"=["A","D"]
                }
                
                //////////////////////////////////////////////////
                        Graph BigO
                //////////////////////////////////////////////////
                
                For big O, let's look first at SPACE COMPLEXITY.
                
                With the vertex A for an adjacency list, we will store the vertex and each one of the edges.
                With an adjacency matrix, we have to store the edges and we also have to store everything it is NOT connected to.
                
                The adjacency list has an advantage over the matrix for space complexity.
                
                Adjacency Matrix = O(|V|^2) O of the # of vertices squared
                Adjacency List = O(|V| + |E|) # of vertices + # of edges
                
                If we want to add a vertex to the graph (not adding an edge yet):
                    adding vertex "F"
                {
                    "A"=["B","E"],
                    "B"=["A","C"],
                    "C"=["B","D"],
                    "D"=["C","E"],
                    "E"=["A","D"],
                    "F"=[]
                }
                
                with the adjacency matrix, we have to create new arrays to store into a 2-dimensional array which is very inefficient
                
                For a bigO perspective, 
                    the adjacency matrix is the # of vertices squared every time you add a vertex O(|V|^2)
                    the adjacency list is O(1) to add a vertex
                    
                Let's add an edge from B to F in our old graph
                
                    adding edge "F" to "B"
                {
                    "A"=["B","E"],
                    "B"=["A","C", "F"], <-- F is added to B
                    "C"=["B","D"],
                    "D"=["C","E"],
                    "E"=["A","D"],
                    "F"=["B"] <-- B is added to F
                }
                
                With the adjacency Matrix, we just change the 0 to a 1 for both the B:F and F:B.
                Both Matrix and List are O(1) to add an edge
                
                Let's see about removing F and B edge:
                
                {
                    "A"=["B","E"],
                    "B"=["A","C"], <-- Finding a key in a hash map is O(1), but we have to iterate through the entire arraylist to remove F
                    "C"=["B","D"],
                    "D"=["C","E"],
                    "E"=["A","D"],
                    "F"=["B"] <-- We do the same process for F, finding it with key O(1) and iterating through the arraylist to find "B" and removing it
                }
                
                For an adjacency matrix, we just change the 1 from B:F to a 0 and do the same for F:B
                
                The adjacency matrix therefore, outperforms the adjacency list
                    
                    matrix: O(1) 
                    
                    the list must iterate through the entire arraylist, and a particular vertex may have 1000 edges.
                    list: O(|E|)
                    
                    every vertex and every edge will have to be scrutinized in order to remove a specific vertex with the adjacency list
                    
                    with a matrix, we remove the axis but have to rewrite the arrays.
                    
                    both are quite inefficient
                        Matrix: O(|V|^2)
                        List: 0(|V| + |E|)
                        
                    In this course we will use an adjacency list rather than a matrix because matrices require the 1s AND the 0s we are not connected to. If we have a large graph, this becomes VERY inefficient.
                    
                    let's say FB has 1Billion active users. You would have a graph that would be 1B items across, and 1B items down. Even if each of the users had 1000 friends, you would have 1Million 0s for every individual. This is why we will use an adjacency list for this course.
                
                
                """);
    }
}
