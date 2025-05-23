/*
 * Given a number return the xor of 1 to n
 * Brute : Traverse from 1 to n and xor it
 *      Time complexity : O(n)  Space complexity : O(1)
 * 
 */
public class Xor1ToN {
    public static int brute(int n){
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans ^= i;
        }
        return ans;
    }
    public static int optimal(int n){
        if(n % 4 == 0)
            return n;
        else if(n % 4 == 1)
            return 1;
        else if(n % 4 == 2)
            return n + 1;
        else
            return 0;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(brute(n));
        System.out.println(optimal(n));
    }
}
