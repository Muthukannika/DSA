/*
 * Given a number return true if it is a prime
 * Better : Traverse from 2 to n and return false if it was divided by any value otherwise return true
 *      Time complexity : O(n)  Space complexity : O(1)
 * Optimal : Traverse from 2 to sqrt(n) and return false if it is divided by any value otherwise return false
 *      Time complexity : O(sqrt(n))  Space complexity : O(1)
 * 
 */
public class PrimeNumber {
    public static boolean better(int n){
        for(int i = 2;i < n;i++)
            if(n % i == 0)
                return false;
        return true;
    }
    public static boolean optimal(int n){
        for(int i = 2;i * i <= n;i++)
            if(n % i == 0)
                return false;
        return true;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(better(n));
        System.out.println(optimal(n));
    }
}
