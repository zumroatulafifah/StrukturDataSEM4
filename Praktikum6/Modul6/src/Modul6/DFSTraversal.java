package Modul6;

import java.util.*;

public class DFSTraversal {
    private LinkedList<Integer> adj[];
    private boolean visited[];

    public DFSTraversal(int V) {
        adj = new LinkedList[V];
        visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }
        public void insertEdge(int src, int dest){
            adj[src].add(dest);
        }
        public void DFS(int vertex) {
            visited[vertex] = true;
            System.out.print(vertex + " ");

            Iterator<Integer> it = adj[vertex].listIterator();
            while (it.hasNext()) {
                int n = it.next();
                if (!visited[n]) {
                    DFS(n);
                }
            }
        }
            public static void main(String[] args ){
             DFSTraversal graph = new DFSTraversal(18);

                graph.insertEdge(1, 2);
                graph.insertEdge(1, 4);
                graph.insertEdge(2, 5);
                graph.insertEdge(2, 1);
                graph.insertEdge(4, 6);
                graph.insertEdge(5, 2);
                graph.insertEdge(5, 3);
                graph.insertEdge(5, 9);
                graph.insertEdge(5, 7);
                graph.insertEdge(6, 7);
                graph.insertEdge(7, 6);
                graph.insertEdge(7, 11);
                graph.insertEdge(8, 9);
                graph.insertEdge(8, 11);
                graph.insertEdge(9, 5);
                graph.insertEdge(9, 8);
                graph.insertEdge(11, 10);
                graph.insertEdge(11, 7);

                System.out.println("DFS Traversal : ");
                graph.DFS(1);
            }
        }





