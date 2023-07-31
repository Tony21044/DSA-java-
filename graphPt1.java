import java.util.*;

public class graphPt1 {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {
        int V = graph.length;

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // ... Your code for adding edges ...
    }

    public static void BFS(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i])
                BFSutil(graph, i, vis);
        }
    }

    public static void BFSutil(ArrayList<Edge>[] graph, int start, boolean[] vis) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void DFS(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i])
                DFSutil(graph, i, vis);
        }
    }

    public static void DFSutil(ArrayList<Edge>[] graph, int curr, boolean[] vis) {
        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                DFSutil(graph, e.dest, vis);
            }
        }
    }

    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int des, boolean[] vis) {
        if (src == des) {
            return true;
        }
        vis[src] = true;
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if (!vis[e.dest] && hasPath(graph, e.dest, des, vis)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        System.out.println("BFS:");
        BFS(graph);
        System.out.println();

        System.out.println("DFS:");
        DFS(graph);
        System.out.println();

        boolean[] vis = new boolean[V];
        int src = 0;
        int dest = 5;
        System.out.println("Path from " + src + " to " + dest + ": " + hasPath(graph, src, dest, vis));
    }
}





    