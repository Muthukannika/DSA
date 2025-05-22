public class SwapNumbers {
    public static void swap(int a,int b){
        a = a ^ b;  // a = a ^ b
        b = a ^ b;  // b = (a ^ b) ^ b => a ^ (b ^ b) => a
        a = a ^ b;  // a = (a ^ b) ^ a => (a ^ a) ^ b => b 
        System.out.println("After swap : a = "+ a + " b = "+ b);
    }
    public static void main(String[] args) {
        int a = 5,b = 6;
        System.out.println("Before swap : a = "+ a + " b = "+ b);
        swap(a, b);
    }
}
