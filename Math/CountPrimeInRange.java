public class CountPrimeInRange {
    public static int[] primes(int n){
        int[] prime = new int[n + 1];
        for(int i = 2;i < n + 1;i++)
            prime[i] = 1;
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(prime[i] == 1){
                for(int j = i * i;j <= n;j += i)
                    prime[j] = 0;
            }
        }
        return prime;
    } 
    public static int numberOfPrimes(int l,int r){
        int[] prime = primes(r);
        int c = 0;
        for(int i = 2;i < prime.length;i++){
            if(prime[i] == 1)
                c++;
            prime[i] = c;
        }
        return prime[r] - prime[Math.max(0, l - 1)];
    }
    public static void main(String[] args) {
        int l = 1,r = 9;
        System.out.println(numberOfPrimes(l, r));

    }
}
