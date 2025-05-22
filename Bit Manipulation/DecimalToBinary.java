/*
 * Time complexity : O(log2 n)
 * Space complexity : O(log2 n)
 * 
 */
public class DecimalToBinary {
    public static String convertToBinary(int n) {
        StringBuilder sb = new StringBuilder();
        if(n == 0)
            return "0";
        while(n != 0){
            sb.append(String.valueOf(n % 2));
            n /= 2;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(convertToBinary(n));
    }
}
