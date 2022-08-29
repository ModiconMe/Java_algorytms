package deikstra_algoritm;

public class Node {
    String name;
    int cost;
    Node parent;
    boolean isVisited;

    public Node(String name) {
        this.name = name;
        this.parent = null;
        this.cost = 1000;
        isVisited = false;
    }
}
