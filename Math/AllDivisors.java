/*
 * Given a number print all its divisors
 * Better : Traverse from 1 to n and for divisibility and print the divisors
 *      Time complexity : O(n)  Space complexity : O(1)
 * Optimal : If i is the divisor of n then n / i is also a divisor of n
 *      Time complexity : O(sqrt(n))  Space complexity : O(1)
 * 
 */
public class AllDivisors {
    public static void better(int n){
        for (int i = 1; i <= n; i++) {
            if(n % i == 0)
                System.out.print(i +" ");
        }
    }
    public static void optimal(int n){
        for (int i = 1; i * i <= n; i++) {
            if(n % i == 0){
                System.out.print(i + " ");
                System.out.print(n / i + " ");
            }            
        }
    }
    public static void main(String[] args) {
        int n = 40;
        better(n);
        System.out.println();
        optimal(n);
    }
    
}