/*
 * Given an array move all zeros to the last and non - zero elements to front in place
 * Brute force : Store all non-zero elements in array and replace them with front elements and make others as zero
 *      => Time complexity : O(n) + O(x) + O(n - x)  --> O(2n)  Space complexity : O(x)
 * Optimal : Use two pointers j to zero element i to all if arr[i] != 0 swap(arr[i],arr[j])
 *      => Time complexity : O(x) + O(n - x) --> O(n)  Space complexity : O(n)
 */

import java.util.Arrays;

public class MoveZeros {
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void moveZeroes(int[] nums) {
        int j = -1;
        for(int i = 0;i < nums.length;i++)
            if(nums[i] == 0){
                j = i;
                break;
            }
        
        for(int i = j + 1;i < nums.length;i++){
            if(nums[i] != 0){
                swap(nums,i,j);
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,2,0,0,4,5,1};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
