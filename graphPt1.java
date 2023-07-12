import java.util.*;

public class graphPT1 {
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

        // 0th index
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        // 1st index
        graph[1].add(new Edge(1, 3, 1));
        graph[1].add(new Edge(1, 0, 1));

        // 2nd index
        graph[2].add(new Edge(2, 4, 1));
        graph[2].add(new Edge(2, 0, 1));

        // 3rd index
        graph[3].add(new Edge(3, 0, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        // 4th index
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        // 5th index
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        // 6th index
        graph[6].add(new Edge(6, 5, 1));
    }

    public static void BFS(ArrayList<Edge>[] graph) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] Vis = new boolean[graph.length];
        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!Vis[curr]) {
                System.out.print(curr + " ");
                Vis[curr] = true;

                // printing neighbors
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void DFS(ArrayList<Edge>[] graph, int curr, boolean[] vis) {
        // visit
        System.out.print(curr + " ");
        vis[curr] = true;

        // recursive call for neighbors
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                DFS(graph, e.dest, vis);
            }
        }
    }

    //QUE = HAS PATH = WE NEED TO FIND OUT THERE IS A PATH OR NOT FROM SOURCE AND DESTINATION 
    //tc = O(V+E)
    public static boolean hasPath(ArrayList<Edge> graph[], int src,int des,boolean vis[] ){
        //base case 
        if(src == des){
            return true;;

        }
        vis[src] = true; //assign kia kuki phla viisit apne source ka hi to hai
        for(int i = 0; i<graph[src].size() ; i++){
            //edge banayege kuki edge ki dest hi to apna target hai
            Edge e = graph[src].get(i);
            if(!vis[e.dest] && hasPath(graph, src, des, vis)); // eddge kindest visit nhi hui hai to we will call _____
            return true;
        }
         return false;
    }

    //QUE = CONNECTED COMPONENETS 
    //dividng up BFS IN 2 COMPONNENTS 
     public static void BFS(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        for(int i =0; i<graph.length;i++){
            if(!vis[i])
            BFS(graph,vis);
        }
     }

public static void BFSutil(ArrayList<Ege>graph[] , boolean vis[]){      
Queue<Integer> q = new LinkedList<>();
        // boolean[] Vis = new boolean[graph.length]; upper s a parameter pased 
        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!Vis[curr]) {
                System.out.print(curr + " ");
                Vis[curr] = true;

                // printing neighbors
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    //DIVIDG UP DFS IN 2 COMP

    public sttaic void DFS(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for(int i = 0;i<graph.length;i++){
            DFSutil(graph, i, vis);

            
        }

    }

     public static void DFSutil(ArrayList<Edge>[] graph, int curr, boolean[] vis) {
        // visit
        System.out.print(curr + " ");
        vis[curr] = true;

        // recursive call for neighbors
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                DFSutil(graph, e.dest, vis);
            }
        }
    }
   //MAIN WORK SHOULD BE TRANSFERED IN THE YTILY FUCTION TO WORK

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        //BFS(graph);
        System.out.println(); // Print a new line before DFS traversal
       // DFS(graph, 0, new boolean[V]);
        hasPath(graph, 0, 5, new boolean[V]);
    }
}













    