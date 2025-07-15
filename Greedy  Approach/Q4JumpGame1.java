import java.util.Scanner;

public class Q4JumpGame1 {
    public static boolean canReachLast(int[] arr) {
        int maxPosition = 0;
        for(int i = 0;i < arr.length;i++) {
            if(i > maxPosition) return false;
            maxPosition = Math.max(maxPosition, i + arr[i]);
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++)
            arr[i] = sc.nextInt();
        System.out.println(canReachLast(arr));
        sc.close();
    }
}
