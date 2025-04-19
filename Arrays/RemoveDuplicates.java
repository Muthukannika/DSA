/*
 * Remove the duplicate elements in an array in place
 * Brute force : Have a set to find unique elements and replace the front elements with the set elements
 *      => Time complexity : O(n logn) (To insert into set) + O(n)    Space complexity : O(n)
 *  Optimal : Traverse the array with two pointers (i,j) if arr[i] != arr[j] then arr[i++] = arr[j] j++
 */
import java.util.Arrays;

public class RemoveDuplicates {
    public static int[] removeDuplicate(int[] arr){
        int index = 0;
        for(int i = 1;i < arr.length;i++){
            if(arr[i] != arr[index]){
                arr[++index] = arr[i];
            }
        }
        System.out.println(index + 1);
        return arr;
    } 
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,3};
        System.out.println(Arrays.toString(removeDuplicate(arr)));
    }
}
