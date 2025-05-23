/*
 * Given an array in which all numbers occurs twice except one find the single number
 */
public class SingleNumber1 {
    public static int singleNumber(int[] arr){
        int ans = 0;
        for (int i : arr) {
            ans ^= i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        System.out.println(singleNumber(arr));
    }
}
