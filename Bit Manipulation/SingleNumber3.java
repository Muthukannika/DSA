/*
 * Given an array in which all numbers occurs twice except two numbers find them
 * Time complexity : O(n)  Space complexity : O(1)
 */
public class SingleNumber3 {
    public static void singleNumbers(int[] arr){
        int xor = 0;
        for (int i : arr) {
            xor ^= i;
        }
        int right = (xor & (xor - 1)) ^ xor;
        int b1 = 0,b2 = 0;
        for (int i : arr) {
            if((i & right) != 0)
                b1 ^= i;
            else
                b2 ^= i;
        }
        System.out.println(b1);
        System.out.println(b2);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,1};
        singleNumbers(arr);
    }
}
