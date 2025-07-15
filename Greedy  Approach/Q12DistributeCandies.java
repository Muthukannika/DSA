import java.util.Arrays;

public class Q12DistributeCandies {
    public static int brute(int[] arr) {
        int total = 0;
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 1;
        right[n - 1] = 1;
        for(int i = 1;i < n;i++) {
            if(arr[i] > arr[i - 1])     left[i] = left[i - 1] + 1;
            else    left[i] = 1;
        }
        for(int i = n - 2;i >= 0;i--) {
            if(arr[i] > arr[i + 1])     right[i] = right[i + 1] + 1;
            else    right[i] = 1;
        }
        for(int i = 0;i < n;i++) {
            total += Math.max(left[i], right[i]);
        }
        /*
         * curr = 1,right = 1,total = Math.max(left[n - 1],1);
         * for(int i = n - 2;i >= 0;i--) {
         *      if(arr[i] > arr[i + 1]) {
         *          curr = right + 1;
         *          right = curr;
         *      }
         *      else
         *          curr = 1;
         *      total += Math.max(curr,left[i]);
         * }
         */
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        return total;
    }
    public static int optimalSolution(int[] arr) {
        int total = 1;
        int i = 1,peek,down;
        int n = arr.length;
        while (i < n) {
            if(arr[i] == arr[i - 1]) {
                total += 1;
                i++;
                continue;
            }
            peek = 1;
            while (i < n && arr[i] > arr[i - 1]) {
                peek++;
                total += peek;
                i++; 
            }
            down = 1;
            while (i < n && arr[i] < arr[i - 1]) {
                total += down;
                down++;
                i++;
            }
            if(peek < down)
                total += down - peek;
        }
        return total;
    }
    public static void main(String[] args) {
        int[] arr = {0,2,4,3,2,1,1,3,5,6,4,0,0};
        System.out.println(brute(arr));
        System.out.println(optimalSolution(arr));
    }
}
