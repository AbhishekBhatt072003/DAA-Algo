
import java.util.*;

class TopologicalDFS {

    static void createList(ArrayList<ArrayList<Integer>> adj, int u, int v) {

        adj.get(u).add(v);

    }

    static void printList(ArrayList<ArrayList<Integer>> adj, int v) {
        for (int i = 0; i < v; i++) {
            System.out.print(i);
            for (int j : adj.get(i))
                System.out.print("->" + j);

            System.out.println();
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

        printList(adj, v);

    }

}
