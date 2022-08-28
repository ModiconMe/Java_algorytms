package breadth_first_search.graph;

import breadth_first_search.data.Queue;
import breadth_first_search.data.Stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    private Vertex[] vertexList;
    private int[][] mas;
    private Stack stack;
    private Queue queue;
    private int size;
    private int cur;
    private LinkedList<Integer> linkedList = new LinkedList<>();

    public Graph(int size) {
        this.vertexList = new Vertex[size];
        this.mas = new int[size][size];
        this.stack = new Stack(size);
        this.queue = new Queue(size);
        this.size = size;
        this.cur = 0;
    }

    public void addVertex(String name) {
        vertexList[cur++] = new Vertex(name);
    }

    public void addEdge(int start, int end) {
        mas[start][end] = 1;
        mas[end][start] = 1;
    }

    private int check(int index) {
        for (int i = 0; i < cur; i++) {
            if (mas[index][i] == 1 && !vertexList[i].isVisited) return i;
        }
        return -1;
    }

    public void passInDeep(int index) {
        System.out.println(vertexList[index].name);
        vertexList[index].isVisited = true;
        stack.push(index);

        while (!stack.isEmpty()) {
            int neigh = check(stack.peek());

            if (neigh == -1) {
                neigh = stack.pop();
            } else {
                System.out.println(vertexList[neigh].name);
                vertexList[neigh].isVisited = true;
                stack.push(neigh);
            }
        }

        for (int i = 0; i < cur; i++) {
            vertexList[i].isVisited = false;
        }
    }

    public void passInWidth(int index) {
        System.out.println(vertexList[index].name);
        vertexList[index].isVisited = true;
//        queue.insert(index);
        linkedList.add(index);
        int vertex;
        while (!queue.isEmpty()) {
//            int temp = queue.remove();
            int temp = linkedList.pollFirst();
            while ((vertex = check(temp)) != -1) {
                System.out.println(vertexList[vertex].name);
                vertexList[vertex].isVisited = true;
//                queue.insert(vertex);
                linkedList.addFirst(index);
            }
        }
        for (int i = 0; i < cur; i++) {
            vertexList[i].isVisited = false;
        }
    }
}
