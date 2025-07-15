import java.util.Scanner;

public class Q5JumpGame2 {
    public static int recursiveSolution(int index,int cost,int[] arr) {
        if(index >= arr.length - 1) {
            return cost;
        }
        int minCost = Integer.MAX_VALUE;
        for(int i = 0;i <= arr[index];i++) {
            minCost = Math.min(minCost,recursiveSolution(index + i, minCost + 1, arr));
        }
        return minCost;
    }
    // public static int dynamicProgrammingSolution(int index,int cost,int arr) {
        
    // }
    public static int greedySolution(int[] arr) {
        int jumps = 0;
        int l = 0,r = 0;
        int farthest;
        while (r < arr.length - 1) {
            farthest = 0;
            for(int i = l;i <= r;i++)
                farthest = Math.max(farthest, i + arr[i]);
            l = r + 1;
            r = farthest;
            jumps++;
        }
        return jumps;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++)
            arr[i] = sc.nextInt();
        System.out.println("By recursion : " + recursiveSolution(0,0,arr));
        // System.out.println("By greedy : " + greedySolution(arr));
        sc.close();
    }
}
