/*
 * Given an array find the length of longest consecutive sequence i.e from x to x + n
 * Brute : Take the eleemnt search for its adjacent element through out the array
 *      Time complexity : O(n * n)  Space complexity : O(n)
 * Better : Sort the array and check for contiguous elements
 *      Time complexity : O(n) + O(n logn)   Space complexity : O(n)
 * Optimal : Store the elements in the set and look for eleemnt's precious element if it is not present search for seq from that element
 *      Time complexity : O(n) + O(2n)  Space complexity : O(n) + O(n) (for set and arr input)
 */

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSeq {
    public static int better(int[] arr){
        int ans = 1;
        Arrays.sort(arr);
        int small = Integer.MIN_VALUE;
        int c = 1;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == small + 1)
                c++;
            else if(arr[i] != small)
                c = 1;
            small = arr[i];
            ans = Math.max(ans, c);
        }
        System.out.println(Arrays.toString(arr));
        return ans;
    }
    public static int optimal(int[] arr){
        int ans = 1;
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr)
            set.add(num);
        int c = 1;
        int next;
        for(int num : set){
            if(!set.contains(num - 1)){
                next = num + 1;
                do{
                    c++;
                    next = next + 1;
                }while(set.contains(next));
            }
            else{
                c = 1;
            }
            ans = Math.max(ans, c);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {100,102,100,101,101,4,3,2,3,2,1,1,1,2};
        System.out.println(better(arr));
        System.out.println(optimal(arr));
    }
}
