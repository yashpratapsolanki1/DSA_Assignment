import java.util.*;
public class GraphDFS {
    static void dfs(List<List<Integer>> g, int v, boolean[] seen) {
        seen[v] = true; System.out.print(v + " ");
        for (int next : g.get(v)) if (!seen[next]) dfs(g,next,seen);
    }
    public static void main(String[] args) {
        List<List<Integer>> g = new ArrayList<>(); for (int i=0;i<5;i++) g.add(new ArrayList<>());
        g.get(0).add(1); g.get(0).add(2); g.get(1).add(3); g.get(2).add(4);
        System.out.print("DFS: "); dfs(g,0,new boolean[5]);
    }
}
