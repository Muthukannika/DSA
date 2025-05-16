/*
 * Given a number return true if it is amstrong number ie sum of cubes of it's digits is equal to the same number
 * Time complexity : O(log10 n)
 * Space complexity : O(1)
 * 
 */
public class AmstrongNumber {
    public static boolean isAmstrong(int n){
        int ans = 0,temp = n;
        while(n != 0){
            ans += Math.pow(n % 10, 3);
            n /= 10;
        }
        return ans == temp;
    }
    public static void main(String[] args) {
        int a = 371,b = 89;
        System.out.println(isAmstrong(a));
        System.out.println(isAmstrong(b));
    }
}
