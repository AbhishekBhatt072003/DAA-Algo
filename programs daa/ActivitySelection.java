import java.io.*;
import java.lang.*;
import java.util.*;

class Activity {
    int start;
    int finish;

    public Activity(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}

class SortByFinish implements Comparator<Activity> {
    public int compare(Activity a, Activity b) {
        return a.finish - b.finish;
    }
}

class Selection {
    static void print(Activity obj[]) {
        for (int i = 0; i < obj.length; i++)
            System.out.println(obj[i].start + " " + obj[i].finish);
    }

    static void ActivitySelection(Activity obj[]) {
        System.out.println("Jobs Selected");
        System.out.println(obj[0].start + " " + obj[0].finish);
        for (int i = 1; i < obj.length; i++) {
            if (obj[i].start >= obj[i - 1].finish)
                System.out.println(obj[i].start + " " + obj[i].finish);
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of jobs");
        int n = sc.nextInt();
        int start, finish;
        System.out.println("Enter Start and finish time of job");
        Activity obj[] = new Activity[n];
        for (int i = 0; i < n; i++) {
            start = sc.nextInt();
            finish = sc.nextInt();
            obj[i] = new Activity(start, finish);
        }
        System.out.println("Unsorted");
        print(obj);
        Arrays.sort(obj, new SortByFinish());
        System.out.println("Sorted by Finish Time");
        print(obj);
        ActivitySelection(obj);
    }
}
