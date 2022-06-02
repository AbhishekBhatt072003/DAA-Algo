import java.util.*;

class BFS {
    static ArrayList<Integer> bfsTraversal(int n, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<Integer>();
        boolean vis[] = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            if (vis[i] == false) {
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                vis[i] = true;

                while (!q.isEmpty()) {
                    int node = q.poll();
                    bfs.add(node);

                    for (int j : adj.get(node)) {
                        if (vis[j] == false) {
                            vis[j] = true;
                            q.add(j);
                        }
                    }
                }
            }
        }

        return bfs;
    }
}
