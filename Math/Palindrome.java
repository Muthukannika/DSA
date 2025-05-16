/*
 * Given a number return true if it is a palindrome
 * Time complexity : O(log10 n)
 * Space complexity : O(1)
 */
public class Palindrome {
    public static boolean isPalindrome(int n){
        int temp = n;
        int rev = 0;
        while(n != 0){
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }
        return temp == rev;
    }
    public static void main(String[] args) {
        int a = 121;
        int b = 90;
        System.out.println(isPalindrome(a));
        System.out.println(isPalindrome(b));
    }
}
