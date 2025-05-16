/*
 * Given a number n find the number of digits in it
 * Better : Divide the number by 10 until it becomes zero and count it
 * Optimal : The expression log10(n) + 1 gives the number of digits of n
 * Time complexity : O(log10 n)
 * Space complexity : O(1)
 */
public class NumberOfDigits{
    public static int better(int n){
        int c = 0;
        if(n == 0)
            return 1;
        while(n != 0){
            c++;
            n /= 10;
        }
        return c;
    }
    public static int optimal(int n){
        return (int)Math.log10(n) + 1;
    }
    public static void main(String[] args) {
        int n = 89454;
        System.out.println(better(n));
        System.out.println(optimal(n));
    }
}