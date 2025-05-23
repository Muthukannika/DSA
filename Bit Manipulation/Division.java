/*
 * Given two numbers divide them without using /
 * Brute : Add the divisor until the sum is greater than dividend
 *      Time complexity : O(n)  Space complexity : O(1)
 */
public class Division {
    public static int brute(int a,int b){
        int sum = 0,count = 0;
        boolean sign = (a > 0) && (b > 0);
        a = Math.abs(a);
        b = Math.abs(b);
        while (sum <= a) {
            sum += b;
            count++;
        }
        if (sign) {
            return count - 1;
        }
        return -(count - 1);
    }
    public static int better(int a,int b){
        if(a == b)  return 1;
        boolean sign = (a > 0) & (b > 0);
        a = Math.abs(a);
        b = Math.abs(b);
        int ans = 0;
        while (a >= b) {
            int count = 0;
            while (a >= (b << (count + 1))) {
                count++;
            }
            ans += (1 << count);
            a -= b * (1 << count);
        }
        if(ans >= Math.pow(2, 31) && sign == true)  return Integer.MAX_VALUE;
        if(ans >= Math.pow(2, 31) && sign == false)  return Integer.MAX_VALUE;
        if(sign)    return ans;
        return -ans;
    }
    public static void main(String[] args) {
        int a = -22,b = 3;
        System.out.println(brute(a, b));
        System.out.println(better(a, b));
    }
    
}
