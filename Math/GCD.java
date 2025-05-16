/*
 * Given two numbers return the gcd of those numbers
 * Better : Traverse from 1 to min(a,b); If a number divides both replace the answer as that number
 *      Time complexity : O(n)  Space complexity : O(1)
 * Optimal : Use the euclidean algorithm gcd(a,b) = a if b == 0;otherwise return gcd(b,a % b)  
 *      Time complexity : O(log (min(a,b)))  Space complexity : O(1)
 */
public class GCD {
    public static int better(int a,int b){
        int gcd = 1;
        for(int i = 2;i <= Math.min(a, b);i++){
            if(a % i == 0 && b % i == 0)
                gcd = i;
        }
        return gcd;
    }
    public static int gcd(int a,int b){
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        int a = 7,b = 21;
        System.out.println(better(a, b));
        System.out.println(gcd(a, b));
        
    }
    
}
