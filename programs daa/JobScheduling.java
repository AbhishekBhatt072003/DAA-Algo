import java.util.*;
import java.io.*;

class Job {
    char id;
    int profit;
    int deadline;

    public Job(char id, int profit, int deadline) {
        this.id = id;
        this.profit = profit;
        this.deadline = deadline;
    }
}

class SortByProfit implements Comparator<Job> {
    public int compare(Job a, Job b) {
        return b.profit - a.profit;
    }
}

class JobScheduling {
    static void print(Job obj[]) {
        for (int i = 0; i < obj.length; i++)
            System.out.println(obj[i].id + " " + obj[i].profit + " " + obj[i].deadline);
    }

    static void JobSelection(Job obj[]) {
        int n = obj.length;
        char result[] = new char[n];
        Arrays.fill(result, '0');
        boolean slot[] = new boolean[n];
        Arrays.fill(slot, false);
        for (int i = 0; i < n; i++) {
            for (int j = Math.min(n, obj[i].deadline) - 1; j >= 0; j--) {
                if (slot[j] == false) {
                    result[j] = obj[i].id;
                    // System.out.println(obj[i].id + " " + j);
                    slot[j] = true;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(result));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of jobs");
        int n = sc.nextInt();
        int profit, deadline;
        char id;
        System.out.println("Enter profit and deadline of jobs");
        Job obj[] = new Job[n];
        for (int i = 0; i < n; i++) {
            id = sc.next().charAt(0);
            profit = sc.nextInt();
            deadline = sc.nextInt();
            obj[i] = new Job(id, profit, deadline);
        }

        System.out.println("Unsorted");
        print(obj);
        Arrays.sort(obj, new SortByProfit());
        System.out.println("Sorted by Decreasing order of Profit");
        print(obj);
        JobSelection(obj);
    }
}
