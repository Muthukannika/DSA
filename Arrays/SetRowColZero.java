/*
 * Given an n x m matrix of 0s and 1s if the element is 0 make it's row and column to zero
 * Brute : Traverse the matrix if there is 0 change the row and col to -1 and once again traverse the matrix to change -1 to 0
 *      Time complexity : O(n^3)  Space complexity : O(1)  (No extra space)
 * Better : Keep track of the row and column have to be changed and mark it it zero at last instead doing it while traversing
 *      Time complexity : O(n * n)   Space complexity : O(n + m)
 * Optimal : Instead of taking new array for rows and cols in better solution make the first row and fist column of the matrix as reference axis
 *      Time complexity : O(n * n)  Space complexity : O(1) (No extra space used)
 * 
 */

public class SetRowColZero {
    public static void changeRow(int[][] arr,int row){
        for(int i = 0;i < arr[0].length;i++)
            arr[row][i] = -1;
    }

    public static void changeCol(int[][] arr,int col){
        for(int i = 0;i < arr.length;i++)
            arr[i][col] = -1;
    }

    public static void printMatrix(int[][] arr){
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void brute(int[][] arr){
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                if(arr[i][j] == 0){
                    changeRow(arr, i);
                    changeCol(arr, j);
                }
            }
        }
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr.length;j++)
                if(arr[i][j] == -1)
                    arr[i][j] = 0;
        }

        printMatrix(arr);
    }

    public static void better(int[][] arr){
        int rows[] = new int[arr.length];
        int cols[] = new int[arr[0].length];

        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                if(arr[i][j] == 0){
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }

        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                if(rows[i] == 1 || cols[j] == 1)
                    arr[i][j] = 0;
            }
        }

        printMatrix(arr);
    }

    public static void optimal(int[][] arr){
        int col0 = 1;
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                if(arr[i][j] == 0){
                    arr[i][0] = 0;
                    if(j == 0)
                        col0 = 0;
                    else
                        arr[0][j] = 0;
                }
            }
        }
        for(int i = 1;i < arr.length;i++){
            for(int j = 1;j < arr[0].length;j++){
                if(arr[i][0] == 0 || arr[0][j] == 0)
                    arr[i][j] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[0][0] == 0){
                arr[0][i] = 0;
            }
        }
        for (int i = 0; i < arr[0].length; i++) {
            if(col0 == 0)
                arr[i][0] = 0;
        }
        printMatrix(arr);
    }

    public static void main(String[] args) {
        int[][] arr = {{1,1,1,1},{1,0,1,1},{1,1,0,1},{0,1,1,1}};
        System.out.println("Input matrix");
        printMatrix(arr);
        // System.out.println("Output matrix by brute");
        // brute(arr);
        // System.out.println("Output matrix by better");
        // better(arr);
        System.out.println("Output matrix by optimal");
        optimal(arr);
    }
    
}
