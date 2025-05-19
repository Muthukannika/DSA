/*
 * Given the row and column return the element in the pascal triangle in the given position
 * Brute : Generate the pascal triangle elements till the given row and return the corresponding element
 *      Time complexity : O(r * c)  Space complexity : O(n * m)
 * Optimal : (row - 1) C (col - 1) is the required element
 *      Time complexity : O(n)  Space complexity : O(1)
 * 
 */
public class PascalTriangle1 {
    public static int nCr(int n,int r){
        int res = 1;
        for(int i = 0;i < r;i++){
            res = res * (n - i);
            res /= (i + 1);
        }
        return res;
    }
    public static void main(String[] args) {
        int row = 10,col = 3;
        System.out.println(nCr(row - 1, col - 1));
    } 
}
