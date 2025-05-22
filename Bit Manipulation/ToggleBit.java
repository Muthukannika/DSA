public class ToggleBit {
    public static int toggleBit(int n,int i){
        return n ^ (1 << i);
    }
    public static void main(String[] args) {
        int n = 5,i = 3;
        System.out.println(toggleBit(n, i));
    }
}
