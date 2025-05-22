/*
 * Time complexity : O(n)
 * Space complexity : O(1)
 * 
 */
public class BinaryToDecimal{
    public static int toDecimal(String s){
        int res = 0,p = 1;
        for(int i = s.length() - 1;i >= 0;i--){
            if(s.charAt(i) == '1')
                res += p;
            p *= 2;
        }
        return res;
    }
    public static void main(String[] args) {
        String b = "1101";
        System.out.println(toDecimal(b));
    }
}