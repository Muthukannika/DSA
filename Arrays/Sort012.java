/*
 * Given an array of 0s 1s and 2s and sort it
 * Brute force : Sort it base don any sorting technique (Merge sort)
 *      => Time complexity : O(n * logn) Space complexity : O(n)
 * Better : Count the number of 0s 1s and 2s and override the array as per the count
 *      => Time complexity : O(n + n) Space complexity : O(n)
 * Optimal : Dutch National Flag Algorithm Have three pointers low, mid and high Assume that 
 *      from 0 to low - 1 the array is has 0 
 *      from low to mid - 1 it has 1
 *      from mid to high it is unsorted
 *      from high + 1 to n has 2
 *      if (arr[mid] == 0)  then swap(arr[low],arr[mid]) low++ mid++
 *      else if(arr[mid] == 1)  then mid++
 *      else if(arr[mid] == 2) then swap(arr[mid],arr[high]) high--
 *      => Time complexity : O(n)  Space complexity : O(n)
 */

import java.util.Arrays;

public class Sort012 {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int[] sort(int[] arr){
        int low = 0,mid = 0,high = arr.length - 1;
        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr, low, mid);
                mid++;
                low++;
            }
            else if(arr[mid] == 1)
                mid++;
            else{
                swap(arr, mid, high);
                high--;
            }
        }
        return arr;
    } 
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,2,1,2,0,0,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
