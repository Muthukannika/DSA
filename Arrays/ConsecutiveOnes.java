/*
 * Given an array of 0's and 1's find the maximum number os consecutive 1's
 * 
 */
public class ConsecutiveOnes {
    public static int consecutiveOnes(int[] arr) {
        int max = 0;
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                c++;
            else {
                max = Math.max(max, c);
                c = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,1,0,0,1,1,1};
        System.out.println(consecutiveOnes(arr));
    }

}
