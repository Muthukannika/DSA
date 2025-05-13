/*
 * Given an array with equal number of positive and negative elements rearrage the array such that positive and negative elements appears alternatively with the order maintained
 * Brute : Store the positive and negative in different arrays and merge them
 *      Time complexity : O(n) + O(n / 2)  Space complexity : O(n)
 * Optimal : Have a pointer for pos and neg elements position Traverse the array once and put them as per the pointer
 *      Time complexity : O(n)  Space complexity : O(n)
 * 
 */

import java.util.Arrays;

public class RearrageBySign {

    public static void brute(int[] arr){
        int pos[] = new int[arr.length / 2];
        int neg[] = new int[arr.length / 2];

        int i = 0,j = 0;
        for(int num : arr){
            if(num > 0)
                pos[i++] = num;
            else
                neg[j++] = num;
        }
        for(i = 0;i < arr.length / 2;i++){
            arr[2 * i] = pos[i];
            arr[2 * i + 1] = neg[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void optimal(int[] arr){
        int pos = 0,neg = 1;
        int[] ans = new int[arr.length];
        for(int i = 0;i < arr.length;i++){
            if(arr[i] > 0){
                ans[pos] = arr[i];
                pos += 2;
            }
            else{
                ans[neg] = arr[i];
                neg += 2;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        // brute(arr);
        optimal(arr);
    }
    
}
