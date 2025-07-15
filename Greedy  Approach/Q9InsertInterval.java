import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q9InsertInterval {
    public static void insertInterval(int[][] arr,int[] interval) {
        List<int[]> res = new ArrayList<>();
        int i = 0;
        int n = arr.length;
        while(i < n && arr[i][1] < interval[0]) {
            res.add(arr[i]);
            i++;
        }

        while(i < n && arr[i][0] < interval[1]) {
            interval[0] = Math.min(interval[0],arr[i][0]);
            interval[1] = Math.max(interval[1], arr[i][1]);
            i++;
        }
        res.add(interval);

        while(i < n) {
            res.add(arr[i]);
            i++;
        }
        for(int[] a : res) 
            System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0;i < n;i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int[] newInterval = new int[2];
        System.out.print("New interval : ");
        newInterval[0] = sc.nextInt();
        newInterval[1] = sc.nextInt();
        insertInterval(arr, newInterval);
        sc.close();
    }
}
