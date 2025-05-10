/*
 * Given an array and a target return true if there exists a pair of numbers with the sum target else false
 * Brute force : Try with all pair of numbers
 *      => Time complexity : O(n * n) Space complexity : O(n)
 * Better : Traverse the array once and store the (arr[i],i) in map if target - arr[i] is not in the map
 *      => Time complexity : O(n) or O(n * logn) depends on map used Space complexity : O(n + n)
 * Optimal : Sort the arr and use two pointers one(i) at start and another(j) at end if their sum is less than target i++ else j--
 *      => Time complexity : O(n) + O(logn) for sorting Space complexity : O(n) 
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static boolean brute(int[] arr,int target) {
        for(int i = 0;i < arr.length;i++){
            for(int j = i + 1;j < arr.length;j++){
                if(arr[i] + arr[j] == target)
                    return true;
            }
        }
        return false;
    }
    public static boolean better(int[] arr,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < arr.length;i++){
            if(map.containsKey(target - arr[i]))
                return true;
            map.put(arr[i],i);
        }
        return false;
    } 
    public static boolean optimal(int[] arr,int target){
        int i = 0,j = arr.length - 1;
        Arrays.sort(arr);
        while(i < j){
            int sum = arr[i] + arr[j];
            if(sum == target)
                return true;
            else if(sum < target)
                i++;
            else
                j--;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;
        System.out.println(optimal(arr, target));
    }
}
