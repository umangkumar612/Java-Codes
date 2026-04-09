import java.io.*;
import java.util.*;

public class BuildingRoads {
    public int find(int x, int[] par) {
        if (x == par[x]) return x;
        return par[x] = find(par[x], par);
    }

    public void connectMissingRoads(int n, int[][] edges) {
        int[] par = new int[n];
        for (int i = 0; i < n; i++) par[i] = i;

        for (int[] edge : edges) {
            int x = find(edge[0], par);
            int y = find(edge[1], par);
            if (x != y) {
                par[x] = y;
            }
        }

        // Collect unique roots
        Set<Integer> rootsSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            rootsSet.add(find(i, par));
        }

        List<Integer> roots = new ArrayList<>(rootsSet);
        int k = roots.size() - 1;
        System.out.println(k); // Number of new roads needed

        // Connect components linearly
        for (int i = 0; i < roots.size() - 1; i++) {
            int u = roots.get(i);
            int v = roots.get(i + 1);
            System.out.println((u + 1) + " " + (v + 1)); // 1-based output
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // Number of cities
        int m = Integer.parseInt(st.nextToken()); // Number of existing roads

        int[][] edges = new int[m][2];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            edges[i][0] = Integer.parseInt(st.nextToken()) - 1; // 0-based
            edges[i][1] = Integer.parseInt(st.nextToken()) - 1;
        }

        BuildingRoads obj = new BuildingRoads();
        obj.connectMissingRoads(n, edges);
    }
}
