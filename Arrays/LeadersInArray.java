/*
 * Given an array and find the leaders of the array ie. the element for which the elements to it's right are smaller than that
 * Brute : Check for all element if there is a element present to its right wich is greater
 *      Time complexity : O(n * n)  Space complexity : O(n)
 * Optimal : Keep track of maximum element from the right side and compare with the element if it is greater add it and update maximum
 *      Time complexity : O(n)  Space complexity : O(n)
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    public static void brute(int arr[]){
        List<Integer> list = new ArrayList<>();
        boolean flag = true;
        for(int i = 0;i < arr.length;i++){
            flag = true;
            for(int j = i + 1;j < arr.length;j++){
                if(arr[j] > arr[i]){
                    flag = false;
                    break;
                }
            }
            if(flag)
                list.add(arr[i]);
        }
        System.out.println(list);
    }
    public static void optimal(int[] arr){
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = arr.length - 1;i >= 0;i--){
            if(arr[i] > max)
                list.add(arr[i]);
            max = Math.max(max, arr[i]);
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};
        brute(arr);
        optimal(arr);
    }
}
