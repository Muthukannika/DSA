/*
 * Given an array and target find the lower bound(minimum index such that arr[index] >= target) and the
 * upper bound(minimum index such that arr[index] > target)
 */
public class LowerUpperBound {
    public static int lower(int[] arr,int target){
        int ans = arr.length;
        int low = 0,high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] >= target){
                ans = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return ans;
    }
    public static int upper(int[] arr,int target){
        int ans = arr.length;
        int low = 0,high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] > target){
                ans = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,5,8,8,10,10,11};
        int target = 8;
        System.out.println(lower(arr, target));
        System.out.println(upper(arr, target));
    }
}
