package Modul6;

import java.util.*;

public class BFSTraversal {
    private int numVertices;
    private LinkedList<Integer>[] adjacencyList;

    public BFSTraversal(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new LinkedList[numVertices];
        for (int i = 0; i < numVertices; ++i) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
    }

    public void bfs(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.offer(startVertex);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            Iterator<Integer> iterator = adjacencyList[vertex].listIterator();
            while (iterator.hasNext()) {
                int neighbor = iterator.next();
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        int numVertices = 18;
        BFSTraversal bfsExample = new BFSTraversal(numVertices);

        bfsExample.addEdge(1, 2);
        bfsExample.addEdge(1, 4);
        bfsExample.addEdge(2, 5);
        bfsExample.addEdge(2, 1);
        bfsExample.addEdge(4,6);
        bfsExample.addEdge(5, 2);
        bfsExample.addEdge(5, 3);
        bfsExample.addEdge(5, 9);
        bfsExample.addEdge(5, 7);
        bfsExample.addEdge(6,7);
        bfsExample.addEdge(7,6);
        bfsExample.addEdge(7,11);
        bfsExample.addEdge(8,9);
        bfsExample.addEdge(8,11);
        bfsExample.addEdge(9,5);
        bfsExample.addEdge(9,8);
        bfsExample.addEdge(11,7);
        bfsExample.addEdge(11,10);

        int startVertex = 6;

        System.out.println("BFS traversal: ");
        bfsExample.bfs(startVertex);
    }
}

