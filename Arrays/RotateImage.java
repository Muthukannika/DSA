/*
 * Given a matrix of size n x n rotate it by 90" in clockwise direction
 * Brute : Declare an array of same size and map it by output[i][j] = input[j][n - 1 - i]
 *      Time complexity : O(n * n)  Space complexiy : O(n * n) (Extra space)
 * Optimal : Transpose the matrix folowed by reverse all the rows
 *      Time complexity : O((n / 2) * (n / 2)) + O(n logn)  Space complexity : O(1) (No extra space used)
 */
public class RotateImage {
    public static void printMatrix(int[][] arr){
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] brute(int[][] arr){
        int len = arr.length;
        int[][] ret = new int[len][len];

        for(int i = 0;i < len;i++){
            for(int j = 0;j < len;j++)
                ret[j][len - i - 1] = arr[i][j];
        }
        printMatrix(ret);
        return ret;
    }
    public static void swap(int[][] arr,int i,int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
    public static void reverse(int[] arr){
        int i = 0,j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void optimal(int[][] arr) {
        //Transpose
        for(int i = 0;i < arr.length;i++){
            for(int j = i + 1;j < arr.length;j++)
                swap(arr, i, j);
        }
        //Reverse the rows
        for(int[] a : arr){
            reverse(a);
        }

        printMatrix(arr);

    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Input matrix");
        printMatrix(arr);
        System.out.println("Rotated matrix");
        optimal(arr);
    }
}
