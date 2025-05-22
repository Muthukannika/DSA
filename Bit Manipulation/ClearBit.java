public class ClearBit {
    public static int clearBit(int n,int i){
        return n & ~(1 << i);
    }
    public static void main(String[] args) {
        int n = 9,i = 2;
        System.out.println(clearBit(n, i));
    }   
}
