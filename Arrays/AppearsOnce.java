/*
 * Given a number n and array of size n - 1 find the missing number from 1 to n
 * Brute force : Use nested loop to find whether a number is present or not
 *      => Time complexity : O(n * n)  Space complexity : O(n)
 * Better : Use hashing to count the frequency of numbers and return the number with frequenct 0
 *      => Time complexity : O(n + n)  Space complexity : O(n)
 * Optimal 1 : Using sum of first n values --> sum of 1 to n - sum of array
 *      => Time complexity : O(n)  Space complexity : O(1)
 * Optimal 2 : xor1 = xor(1 to n) xor2 = xor(array) then answer is xor(xor1,xor2)
 *      => Time complexity : O(n)  Space complexity : O(1) 
 */
public class AppearsOnce {
    public static int missing(int n,int[] arr){
        int x1 = 0,x2 = 0;
        for(int i = 0;i < n - 1;i++){
            x1 = x1 ^ arr[i];
            x2 = x2 ^ (i + 1);
        }
        x1 = x1 ^ n;
        return x1 ^ x2;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1,2,4,5};
        System.out.println(missing(n, arr));
    }
}
