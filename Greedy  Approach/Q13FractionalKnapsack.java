import java.util.Arrays;

public class Q13FractionalKnapsack {
    public static int maxProfit(int[][] arr,int capacity) {
        int profit = 0;
        Arrays.sort(arr, (a,b) -> (b[0] / b[1]) - (a[0] / a[1]));
        for(int[] a : arr)
            System.out.println(Arrays.toString(a));
        for(int[] a : arr) {
            if(a[1] <= capacity) {
                profit += a[0];
                capacity -= a[1];
            }
            else if(capacity > 0) {
                profit += capacity * (a[0] / a[1]);
                break;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[][] arr = {{100,20},{60,10},{100,50},{200,50}};
        int capacity = 90;
        System.out.println(maxProfit(arr, capacity));
    }
}
