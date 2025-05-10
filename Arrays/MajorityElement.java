/*
 * Given an array return the element which appears more than n / 2 times in the array
 * Brute force : Take an number and traverse the array and count if it is greater than n / 2 return it
 *      => Time complexity : O(n * n) Space complexity : O(n)
 * Better : Count the occurence of element using map or hashing
 *      => Time compleaity : O(n) Space complexity : O(n + n)
 * Optimal : Moore's Voting Algorithm Have two variables element and count
 *           Traverse the  array is the count is 0 element is arr[i] if next is also elemetn count++
 *           else count-- if count = 0 element is arr[i]
 *           Check if the element is answer if it is then return else return -1
 *      => Time complexity : O(n) Space complexity : O(n)
 */

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int better(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < arr.length;i++){
            int c = map.getOrDefault(arr[i], 0);
            if(c + 1 > arr.length / 2)
                return arr[i];
            map.put(arr[i], c + 1);
        }
        return -1;
    }

    public static int optimal(int[] arr){
        int element = arr[0],c = 0;
        for(int i = 0;i < arr.length;i++){
            if(c == 0)
                element = arr[i];
            if(arr[i] == element)
                c++;
            else
                c--;
        }
        c = 0;
        for(int a : arr){
            if(element == a)
                c++;
        }
        return c > arr.length / 2 ? element : -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,3,3,1,2,2};
        System.out.println(optimal(arr));
    }
    
}
