package deikstra_algoritm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    private Node[] nodeList;
    private int[][] mas;
    private int size = 10;
    private int cur;
    private LinkedList<Node> path = new LinkedList<>();
    private LinkedList<Node> queue = new LinkedList<>();

    public Graph(int size) {
        this.nodeList = new Node[size];
        this.mas = new int[size][size];
        this.size = size;
        this.cur = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mas[i][j] = 1000;
            }
        }
    }

    public void addVertex(String name) {
        nodeList[cur++] = new Node(name);
    }

    public void addEdge(int start, int end, int weight) {
        mas[start][end] = weight;
    }

    private int getMin(int index) {
        int minIndex = 0;
        int minValue = 1000;
        for (int i = 0; i < cur; i++) {
            if (nodeList[index].cost + mas[index][i] < nodeList[i].cost) {
                nodeList[i].cost = mas[index][i] + nodeList[index].cost;
            }
            if (nodeList[i].cost < minValue && !nodeList[i].isVisited) {
                minValue = nodeList[i].cost;
                minIndex = i;
            }
        }
        return minIndex;
    }

    public void dijkstra(int startNode, int endNode) {
        nodeList[startNode].cost = 0;
        nodeList[startNode].isVisited = true;
        path.add(nodeList[startNode]);
        queue.addFirst(nodeList[startNode]);


        int curIndex = startNode;

        while (curIndex < endNode) {
            int temp = curIndex;
            curIndex = getMin(curIndex);
            nodeList[curIndex].parent = nodeList[temp];
            nodeList[curIndex].isVisited = true;
            path.add(nodeList[curIndex]);
            queue.addFirst(nodeList[curIndex]);
        }
    }

    public String totalPath() {
        int[] arr = new int[path.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = path.pollFirst().cost;
        }
        return Arrays.toString(arr);
    }

}
