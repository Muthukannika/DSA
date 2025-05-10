/*
 * Given an array find the length of the longest sub array (contiguous elements) that sum up to k
 * Brute force : Generate all sub arrays and check their sum and return the length of longest array that satisfies the condition
 *      => Time complexity : O(n * n)  Space complexity : O(1)
 *  Better : Have a prefix sum if the sum is k and length is maximum thn before put it in map 
 *                             else if the sum is greater than k and map has sum - k before find the length and update
 *      =>  
 */

import java.util.HashMap;
import java.util.Map;

public class LongSubArrPositive {
    public static int better(int[] nums,int k){
        int maxLen = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            sum += nums[i];
            if(sum == k){
                maxLen = Math.max(maxLen, i + 1);
            }
            int rem = sum - k;
            if(map.containsKey(rem)){
                maxLen = Math.max(maxLen, i - map.get(rem));
            }
             if(!map.containsKey(sum))
                map.put(sum, i);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,0,1,1,2,2,3};
        int k = 6;
        System.out.println(better(nums, k));
    }
}
