package breadth_first_search;


import breadth_first_search.graph.Graph;

public class Runner {
    public static void main(String[] args) {
        Graph graph = new Graph(10);

        graph.addVertex("A"); // 0
        graph.addVertex("B"); // 1
        graph.addVertex("C"); // 2
        graph.addVertex("D"); // 3
        graph.addVertex("E"); // 4
        graph.addVertex("F"); // 5

        graph.addEdge(0, 1); // AB
        graph.addEdge(1, 2); // BC
        graph.addEdge(2, 3); // CD
        graph.addEdge(0, 4); // AE
        graph.addEdge(4, 5); // EF

        graph.passInWidth(0);
    }
}
