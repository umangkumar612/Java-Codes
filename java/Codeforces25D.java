import java.util.*;

public class codeforces25D {

    public static int find(int x, int[] parent) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x], parent);
    }

    public static boolean union(int x, int y, int[] par, int[] rank) {
        int par_x = find(x, par);
        int par_y = find(y, par);
        if (par_x == par_y) return false;

        if (rank[par_x] > rank[par_y]) {
            par[par_y] = par_x;
        } else if (rank[par_x] < rank[par_y]) {
            par[par_x] = par_y;
        } else {
            par[par_y] = par_x;
            rank[par_x]++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] par = new int[n + 1];
        int[] rank = new int[n + 1];
        for (int i = 1; i <= n; i++) par[i] = i;

        List<int[]> removed = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            int u = in.nextInt(), v = in.nextInt();
            if (!union(u, v, par, rank)) {
                removed.add(new int[]{u, v});
            }
        }

        // Build ordered list of unique components (roots)
        List<Integer> roots = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int root = find(i, par);
            if (!roots.contains(root)) {
                roots.add(root);
            }
        }

        int numChanges = roots.size() - 1;
        System.out.println(numChanges);

        for (int i = 0; i < numChanges; i++) {
            int[] redundant = removed.get(i);
            int u = roots.get(i);
            int v = roots.get(i + 1);
            System.out.println(redundant[0] + " " + redundant[1] + " " + u + " " + v);
        }
    }
}
