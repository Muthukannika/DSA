/*
 * Find the largest element in an array
 * Brute force : Sort it and return last element  =>  Time complexity : O(n logn)  Space complexity : O(n)
 * Optimal : Take first element as max and traverse the array and exchange the max with greater element 
 *          => Time complexity : O(n)  Space complexity : O(n) 
 */
public class LargestElement {
    public static int largest(int[] arr){
        int max = arr[0];
        for(int i = 1;i < arr.length;i++)
            if(arr[i] > max)
                max = arr[i];
        return max;
    } 
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,4};
        System.out.println(largest(arr));
    }
}