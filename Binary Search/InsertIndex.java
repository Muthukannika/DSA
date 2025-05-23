/*
 * Given an array and target if the target is present in the array return it's index otherwise return the position 
 * where it is to be inserted such that the order is preserved
 */
public class InsertIndex {
    public static int insertIndex(int[] arr,int target){
        int low = 0,high = arr.length - 1;
        int mid = 0;
        while (low < high) {
            mid = low + (high - low) / 2;
            if(arr[mid] == target)  return mid;
            else if(arr[mid] > target)  high = mid - 1;
            else    low = mid + 1;
        }
        if(arr[mid] > target) return mid - 1;
        return mid + 1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,7};
        int target = 6;
        System.out.println(insertIndex(arr, target));
    }

}
