/*
 * Given a matrix of n x m and print the elements of teh matrix in spiral order
 * Time complexity : O(n * m)  Space complexity : O(n * m)
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void printSpiral(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        List<Integer> list = new ArrayList<>();

        int left = 0, top = 0, right = m - 1, bottom = n - 1;

        while (top <= bottom && left <= right) {
            // left to right
            for (int i = left; i <= right; i++) {
                list.add(arr[top][i]);
            }
            top++;

            // top to bottom
            for (int i = top; i <= bottom; i++) {
                list.add(arr[i][right]);
            }
            right--;

            if(top <= bottom){
                // right to left
                for (int i = right; i >= left; i--) {
                    list.add(arr[bottom][i]);
                }
                bottom--;
            }

            if(left <= right){
                // bottom to top
                for (int i = bottom; i >= top; i--) {
                    list.add(arr[i][left]);
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        printSpiral(arr);

    }
}
