public class CountSetBits {
    public static int countSetBits1(int n){
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n = n >> 1;
        }
        return count;
    }
    public static int countSetBits2(int n){
        int count = 0;
        while (n != 0) {
            n = n & (n - 1); //last set bit is cleared
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 12;
        System.out.println(countSetBits1(n));
        System.out.println(countSetBits2(n));
    }
}
