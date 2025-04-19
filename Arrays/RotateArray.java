/*
 * Rotate the given array by left for n positions
 * Number of rotations should be done is d % arr.length
 * Because rotating arr.length times gives the original array
 * Brute force : Copy first d elements in another array shift the remaining and replace last d elements with temp array
 *      => Time complexity : O(d) + O(n-d) + O(d) --> O(d)  Space complexity : O(n) + O(d)
 * Better : 1) Reverse the d elements in array 2) Reverse the last n - d elements 3) Reverse the entire array
 *      => Time complexity : O(d) + O(n - d) + O(n) --> O(2n)  Space complexity : O(n) 
 * Optimal : Traverse the array and store temp[i] = arr[(i + k) % length]
 *      => Time complexity : O(n)  Space complexity : O(n)
 */

import java.util.Arrays;

public class RotateArray {
    public static int[] rotateArray(int[] nums, int k) {
        int[] arr = new int[nums.length];
        for(int i = 0;i < nums.length;i++)
            arr[i] = nums[(i + k) % nums.length];
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        arr = rotateArray(arr,3);
        System.out.println(Arrays.toString(arr));
    }
}