/*
 * Given the numbers a,b return pow(a,b)
 * Better : Initialize the answer as 1;Multiply the answer with a for b times
 *      Time complexity : O(n)  Space complexity : O(1)
 * Optimal :  
 */
public class PowerExponentiation {
    public static int better(int a,int b){
        int ans = 1;
        for(int i = 1;i <= b;i++){
            ans *= a;
        }
        return ans;
    }
    public static int optimal(int a,int b){
        if(b == 0)
            return 1;
        if(b % 2 == 0)
            return optimal(a * a, b / 2);
        else
            return a * optimal(a, b - 1);
    }
    public static void main(String[] args) {
        int a = 2,b = 21;
        System.out.println(better(a, b));
        System.out.println(optimal(a, b));
    }
    
}
