public class SetBit {
    public static int setBit1(int n,int i){
        return n ^ (1 << i);
    }
    public static int setBit2(int n,int i){
        return n | (1 << i);
    }
    public static void main(String[] args) {
        int n = 13,i = 2;
        if(((n >> i) & 1) == 0)
            System.out.println(setBit1(n,i));
        else    
            System.out.println("Already it was set");
        System.out.println(setBit2(n, i));
    }
}
