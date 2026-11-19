import java.util.*;
public class GraphBFS {
    static void bfs(List<List<Integer>> g, int start) {
        boolean[] seen = new boolean[g.size()]; Queue<Integer> q = new LinkedList<>();
        seen[start] = true; q.add(start);
        while (!q.isEmpty()) { int v = q.remove(); System.out.print(v + " ");
            for (int next : g.get(v)) if (!seen[next]) { seen[next] = true; q.add(next); } }
    }
    public static void main(String[] args) {
        List<List<Integer>> g = new ArrayList<>(); for (int i=0;i<5;i++) g.add(new ArrayList<>());
        g.get(0).add(1); g.get(0).add(2); g.get(1).add(3); g.get(2).add(4);
        System.out.print("BFS: "); bfs(g,0);
    }
}
