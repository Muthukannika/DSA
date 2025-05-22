/*
 * INT_MIN = 2^(-31)
 * INT_MAX = 2^(31) - 1
 */
public class Operators {
    public int and(int a,int b){
        /*
         * If both are true then true otherwise false
         * 13   =>  1101
         * 07   =>  0111
         *         ------
         *          0101   =>  05
         *         ------
         */
        return a & b;
    }
    public static int or(int a,int b){
        /*
         * If anyone is true then true otherwise false
         * 13   =>  1101
         * 07   =>  0111
         *         ------
         *          1111   =>  15
         *         ------
         */
        return a | b;
    }
    public static int xor(int a,int b){
        /*
         * If # of 1s is odd then true otherwise false
         * 13   =>  1101
         * 07   =>  0111
         *         ------
         *          1010   =>  10
         *         ------
         */
        return a ^ b;
    }
    public static int rightShift(int a,int b){
        /*
         * Shifting the value a by b bits right removes last b bits from a
         * The answer of a >> b = a / Math.pow(2,b)
         * 1101 >> 2  =  11
         */
        return a >> b;
    }
    public static int leftShift(int a,int b){
        /*
         * Shifting the value a by b bits left adds b 0s to a
         * The answer of a << b = a * Math.pow(2,b)
         * 1101 << 2  =  110100 
         */
        return a << b;
    }
    public static int not(int a){
        /*
         * Flips all the bits of a number if result is +ve then stop else take 2s complement
         */
        return ~a;
    }
    public static void main(String[] args) {
        System.out.println(not(5));
    }
}
