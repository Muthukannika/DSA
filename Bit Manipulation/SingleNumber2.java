/*
 * Given an array in which all numbers occurs thrice except one find the single number
 * Brute : While xor-ing all the numbers among the bits if the number of bits set % 3 == 1 then same bit is set in ans
 *      Time complexity : O(32 * n)     Space complexity : O(1)
 * Better : Sort the array and traverse from 1st index check previous element is equal to that one then move three units 
 * if not equal then the answer is (i - 1)th element Edge case : If the single element is largest then return last element
 *      Time complexity : O(n logn) + O(n / 3)  Space complexity : O(1)
 */

import java.util.Arrays;

public class SingleNumber2 {
    public static int brute(int[] arr){
        int ans = 0,c = 0;
        for(int i = 0;i <= 31;i++){
            c = 0;
            for(int a : arr){
                if((a & (a << i)) != 0)
                    c++;
            }
            if(c % 3 != 0)
                ans = ans | (1 << i);
        }
        return ans;
    }
    public static int better(int[] nums){
        Arrays.sort(nums);
        for(int i = 1;i < nums.length;i += 3){
            if(nums[i] != nums[i - 1])
                return nums[i - 1];
        }
        return nums[nums.length - 1];
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,1,2};
        System.out.println(brute(arr));
        System.out.println(better(arr));
    }
    
}
