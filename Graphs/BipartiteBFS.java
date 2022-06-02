import java.util.*;

class BipartiteBFS {

    static void createList(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void printList(ArrayList<ArrayList<Integer>> adj, int v) {
        for (int i = 0; i < v; i++) {
            System.out.print(i);
            for (int j : adj.get(i)) {
                System.out.print("->" + j);
            }
            System.out.println();
        }
    }

    static void checkBipartiate(ArrayList<ArrayList<Integer>> adj, int v, int e) {
        int vis[] = new int[v + 1];

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
