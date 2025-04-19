/*
 * Given an array where all numbers appears twice except one that appears once find that one
 * Optimal : xor all the values and result is single number
 *      => Time complexity : O(n)  Space complexity : O(1)
 */
public class SingleNumber {
    public static int singleNumber(int[] arr){
        int xor = 0;
        for(int num : arr)
            xor ^= num;
        return xor;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5};
        System.out.println(singleNumber(arr));
    }
}
