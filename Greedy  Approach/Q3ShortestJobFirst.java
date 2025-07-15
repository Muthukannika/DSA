import java.util.Arrays;
import java.util.Scanner;

/*
 * Given a number of processes with its burst time find the average waiting time if we follow the shortest job first
 */
public class Q3ShortestJobFirst {
    public static int averageWaitingTime(int[] arr) {
        int waitingTime = 0;
        int t = 0;
        Arrays.sort(arr);
        for(int i = 0;i < arr.length;i++) {
            waitingTime += t;
            t += arr[i];
        }
        return (int)(waitingTime / arr.length);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++)
            arr[i] = sc.nextInt();
        System.out.println(averageWaitingTime(arr));
        sc.close();
    }
}
