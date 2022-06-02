import java.util.Scanner;

class AdjMatrix {
    static void createGraph(int n) {
        int adj[][] = new int[n + 1][n + 1];

        // edge 1---2
        adj[1][2] = 1;
        adj[2][1] = 1;

        // edge 2---3
        adj[2][3] = 1;
        adj[3][2] = 1;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int adj[][] = new int[n + 1][n + 1];
        createGraph(n);

    }
}