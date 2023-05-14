package Graphs;
import Graphs.AdjacencyListImplementation.Edge;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PQ1 {

    public static void createGraph(ArrayList<Edge>[] graph) {
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

       // graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

       // grap h[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,1,1));

    }

    public static boolean isCyclePresent(ArrayList<Edge>[] graph) {
        int par[] = new int[graph.length];
        boolean vis[] = new boolean[graph.length];

        Queue<Integer> q = new LinkedList<>();
        q.add(0);// cur = 0;

        while (!q.isEmpty()) {
            int u = q.remove();
            for(int i = 0; i < graph[u].size(); i++) {
                Edge e = graph[u].get(i);
                int v = e.dest;
                if(!vis[v]) {
                    vis[v] = true;
                    q.add(v);
                    par[v] = u;
                }
                else if(v != par[u]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V= 3;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println(isCyclePresent(graph));
    }
}
