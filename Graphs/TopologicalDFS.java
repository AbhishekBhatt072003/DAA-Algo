
import java.util.*;

class TopologicalDFS {

    static void createList(ArrayList<ArrayList<Integer>> adj, int u, int v) {

        adj.get(u).add(v);

    }

    static void topologicalSortUtil(ArrayList<ArrayList<Integer>> adj, boolean vis[], int node, Stack<Integer> stack) {
        vis[node] = true;
        for (int j : adj.get(node)) {
            if (!vis[j]) {
                topologicalSortUtil(adj, vis, j, stack);
            }
        }
        stack.push(node);
    }

    static void topologicalSort(ArrayList<ArrayList<Integer>> adj, int n) {
        Stack<Integer> stack = new Stack<Integer>();
        boolean vis[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (vis[i] == false) {
                topologicalSortUtil(adj, vis, i, stack);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes and edges");
        int v = sc.nextInt();
        int e = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
        for (int i = 0; i <= v; i++)
            adj.add(new ArrayList<Integer>());

        System.out.println("Enter the edges one by one");
        for (int i = 0; i < e; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            createList(adj, x, y);
        }

        topologicalSort(adj, v);

    }

}
