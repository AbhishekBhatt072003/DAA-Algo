import java.util.*;

class DFS {

    // create adj list
    static void createList(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    // recursive method for DFS
    static void dfs(int node, int vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans) {
        vis[node] = 1;
        ans.add(node);
        for (int i : adj.get(node)) {
            if (vis[i] == 0)
                dfs(i, vis, adj, ans);
        }
    }

    // Starting point for DFS
    static void startDFS(ArrayList<ArrayList<Integer>> adj, int v) {
        int vis[] = new int[v];
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < v; i++) {
            if (vis[i] == 0)
                dfs(i, vis, adj, ans);
        }

        printAns(ans);
    }

    // print the arrayList
    static void printAns(ArrayList<Integer> ans) {
        System.out.println(ans.toString());
    }

    // Printing the adj list
    static void printList(ArrayList<ArrayList<Integer>> adj, int v) {
        for (int i = 0; i < v; i++) {
            System.out.print(i);
            for (int j : adj.get(i))
                System.out.print("-> " + j);
            System.out.println();
        }

    }

    // driver main function
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
        startDFS(adj, v);
    }
}