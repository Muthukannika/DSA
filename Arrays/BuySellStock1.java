/*
 * Given an array of price of stock on n days return the maximum profit can be made by buy it on one day and sell it on another
 * Brute : Try with all pairs and return the maximum diffrence that you got
 *      Time Complexity : O(n * n)  Space complexity : O(n)
 * Better : (Hint) To sell the stock on ith day we've to buy it minimum of 0 to (i - 1)th day
 *      Time Complexity : O(n)  Space complexity : O(n)
 */
public class BuySellStock1 {

    public static int brute(int[] arr){
        int profit = Integer.MIN_VALUE;
        for(int i = 0;i < arr.length;i++){
            for(int j = i + 1;j < arr.length;j++){
                profit = Math.max(profit, arr[j] - arr[i]);
            }
        }
        return profit;
    }

    public static int better(int[] arr){
        int profit = Integer.MIN_VALUE;
        int mini = arr[0];
        for(int i = 1;i < arr.length;i++){
            profit = Math.max(profit, arr[i] - mini);
            mini = Math.min(mini, arr[i]);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(brute(arr));
        System.out.println(better(arr));
    }
    
}