package deikstra_algoritm;


public class Runner {
    public static void main(String[] args) {
        Graph graph = new Graph(10);

        graph.addVertex("A"); // 0
        graph.addVertex("B"); // 1
        graph.addVertex("C"); // 2
        graph.addVertex("D"); // 3
        graph.addVertex("E"); // 4

        graph.addEdge(0, 1, 5); // AB
        graph.addEdge(0, 2, 2); // AC
        graph.addEdge(2, 1, 2); // CB
        graph.addEdge(1, 4, 7); // BE
        graph.addEdge(2, 3, 8); // CD
        graph.addEdge(3, 4, 10); // DE

        graph.dijkstra(0, 4);
        System.out.println(graph.totalPath());
    }
}
