import java.io.*;
import java.util.*;

public class RoadPreparation2 {

    static class Pair implements Comparable<Pair> {
        int city, cost;

        Pair(int city, int cost) {
            this.city = city;
            this.cost = cost;
        }

        public int compareTo(Pair other) {
            return Integer.compare(this.cost, other.cost);
        }
    }

    public static void main(String[] args) throws IOException {
        // Fast input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<List<Pair>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        // Read all roads
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()) - 1;
            int v = Integer.parseInt(st.nextToken()) - 1;
            int cost = Integer.parseInt(st.nextToken());

            graph.get(u).add(new Pair(v, cost));
            graph.get(v).add(new Pair(u, cost));
        }

        // Prim's setup
        boolean[] inMST = new boolean[n];
        long[] minCost = new long[n];
        Arrays.fill(minCost, Long.MAX_VALUE);
        minCost[0] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.offer(new Pair(0, 0));

        long totalCost = 0;
        int edgesUsed = 0;

        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int u = current.city;

            if (inMST[u]) continue;

            inMST[u] = true;
            totalCost += current.cost;
            edgesUsed++;

            for (Pair neighbor : graph.get(u)) {
                int v = neighbor.city;
                int c = neighbor.cost;
                if (!inMST[v] && c < minCost[v]) {
                    minCost[v] = c;
                    pq.offer(new Pair(v, c));
                }
            }
        }

        if (edgesUsed == n) {
            System.out.println(totalCost);
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}
