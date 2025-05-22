public class RemoveLastSetBit {
    public static int removeLastSetBit(int n){
        return n & (n - 1);
    }
    public static void main(String[] args) {
        int n = 12;
        System.out.println(removeLastSetBit(n));
    }
}
