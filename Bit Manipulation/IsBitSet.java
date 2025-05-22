/*
 * Given a number n and i return true if ith bit is 1 else false
 */
public class IsBitSet {
    public static boolean isSet1(int n,int i){
        return !((n & (1 << i)) == 0);
    }
    public static boolean isSet2(int n,int i){
        n = n >> i;
        n = n & 1;
        return n != 0;
    }
    public static void main(String[] args) {
        int n = 13;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(isSet1(n, 1));
        System.out.println(isSet2(n, 1));
    }
}
