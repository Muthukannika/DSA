/*
 * Given a number return the corresponding reversed number
 * Time complexity : O(log10 n)
 * Space complexity : O(1)
 * 
 */
public class ReverseNumber {
    public static int reverse(int n){
        int rev = 0;
        while(n != 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return rev;
    } 
    public static void main(String[] args) {
        int n = 893;
        System.out.println(reverse(n));
    }
}
