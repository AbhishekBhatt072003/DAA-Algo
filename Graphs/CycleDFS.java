import java.util.*;

class CycleDFS {
    // create adj list and print it
    static void createList(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void printList(ArrayList<ArrayList<Integer>> adj, int v) {
        for (int i = 0; i < v; i++) {
            System.out.print(i);
            for (int j : adj.get(i))
                System.out.print("-> " + j);
            System.out.println();
        }

    }

    // recursive method for DFS
    static boolean checkCycle(int node, int parent, int vis[], ArrayList<ArrayList<Integer>> adj) {
        vis[node] = 1;
        for (int i : adj.get(node)) {

        }

        return false;
    }

    // Starting point for DFS
    static boolean startDFS(ArrayList<ArrayList<Integer>> adj, int v) {
        int vis[] = new int[v];
        for (int i = 0; i < v; i++) {
            if (vis[i] == 0) {
                if (checkCycle(i, -1, vis, adj))
                    return true;

            }
        }
        return false;
    }

    public static void main(String args[]) {
        int v, e;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes and edges");
        v = sc.nextInt();
        e = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
        for (int i = 0; i <= v; i++)
            adj.add(new ArrayList<Integer>());

        System.out.println("Enter the edges");
        for (int i = 1; i <= e; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            createList(adj, x, y);
        }
        printList(adj, v);
    }

}
