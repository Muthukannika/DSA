/* 
 * Find the second largest element in an array
 * Brute force : Sort the array and traverse from (n - 2)nd element if it is not largest (n - 1)st element return it
 *      => Time complexity : O(n logn) + O(n)  Space complexity : O(n)
 * Better : Find the largest from array and traverse it if the element is greater and not largest then assign it to max
 *      =>  Time complexity : O(n) + O(n)  Space complexity : O(n)
 * Optimal : Take largest as first element and smax as -1 traverse the array if the element is greater than largest 
 *           then swap (largest,element) and (smax,largest) else if smax > element then swap
 *      => Time complexity : O(n)  Space complexity : O(n) 
 *           
*/
public class SecondLargest {
    
    public static int secondLargest(int arr[]){
        int max = arr[0];
        int smax = -1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                smax = max;
                max = arr[i];
            }
            else if(max != arr[i] && smax < arr[i])
                smax = arr[i];
        }
        return smax;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,6,8,7};
        System.out.println(secondLargest(arr));
    }
}
