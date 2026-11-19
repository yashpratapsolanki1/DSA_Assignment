import java.util.Arrays;
public class DijkstraShortestPath {
    static final int INF = 1000000;
    static void dijkstra(int[][] g, int source) {
        int n=g.length; int[] dist=new int[n]; boolean[] used=new boolean[n]; Arrays.fill(dist,INF); dist[source]=0;
        for (int c=0;c<n-1;c++) {
            int u=-1; for (int i=0;i<n;i++) if (!used[i] && (u==-1 || dist[i]<dist[u])) u=i;
            if (u==-1 || dist[u]==INF) break; used[u]=true;
            for (int v=0;v<n;v++) if (!used[v] && g[u][v]>0 && dist[u]+g[u][v]<dist[v]) dist[v]=dist[u]+g[u][v];
        }
        for (int i=0;i<n;i++) System.out.println("Distance from "+source+" to "+i+" = "+(dist[i]==INF?"unreachable":dist[i]));
    }
    public static void main(String[] args) {
        int[][] g={{0,4,1,0},{4,0,2,5},{1,2,0,8},{0,5,8,0}}; dijkstra(g,0);
    }
}
