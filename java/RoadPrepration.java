import java.io.*;
import java.util.*;

public class RoadPrepration {

    static class Edge implements Comparable<Edge> {
        int u, v, cost;

        Edge(int u, int v, int cost) {
            this.u = u;
            this.v = v;
            this.cost = cost;
        }

        public int compareTo(Edge other) {
            return Integer.compare(this.cost, other.cost);
        }
    }

    static int find(int x, int[] par) {
        if (par[x] != x) {
            par[x] = find(par[x], par);
        }
        return par[x];
    }

    static boolean union(int x, int y, int[] par, int[] rank) {
        int px = find(x, par);
        int py = find(y, par);
        if (px == py) return false;

        if (rank[px] > rank[py]) {
            par[py] = px;
        } else if (rank[px] < rank[py]) {
            par[px] = py;
        } else {
            par[py] = px;
            rank[px]++;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        // Fast input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // nodes
        int m = Integer.parseInt(st.nextToken()); // edges

        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()) - 1; // 0-based
            int v = Integer.parseInt(st.nextToken()) - 1;
            int cost = Integer.parseInt(st.nextToken());
            edges.add(new Edge(u, v, cost));
        }

        Collections.sort(edges); // Kruskal: sort by cost

        int[] par = new int[n];
        int[] rank = new int[n];
        for (int i = 0; i < n; i++) par[i] = i;

        int usedEdges = 0;
        long totalCost = 0;

        for (Edge e : edges) {
            if (union(e.u, e.v, par, rank)) {
                totalCost += e.cost;
                usedEdges++;
                if (usedEdges == n - 1) break;
            }
        }

        if (usedEdges == n - 1) {
            System.out.println(totalCost);
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}
