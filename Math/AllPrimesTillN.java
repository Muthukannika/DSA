/*
 * Given a number print all the prime numbers from 2 to n
 * (Hint : Use the Sieve of Eratosthanes concept)
 * Time complexity : O(n log(log n)) + O(n)  Space complexity : O(n)
 */
public class AllPrimesTillN {
    public static void printPrimes(int n){
        int[] prime = new int[n + 1];
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(prime[i] == 0){
                for(int j = i * i;j <= n;j += i)
                    prime[j] = 1;
            }
        }
        for(int i= 2;i < prime.length;i++)
            if(prime[i] == 0)
                System.out.print(i + " ");
    }
    public static void main(String[] args) {
        int n = 30;
        printPrimes(n);
    }
    
}
