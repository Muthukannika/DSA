public class BinarySearch {
    public static boolean search(int[] arr,int target){
        int low = 0,high = arr.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == target)
                return true;
            else if(arr[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return false;
    }
    public static boolean recursiveSearch(int[] arr,int target,int low,int high){
        if(low > high)  return false;
        int mid = low + (high - low) / 2;
        if(arr[mid] == target)  return true;
        else if(arr[mid] > target)  return recursiveSearch(arr, target, low, mid - 1);
        else  return recursiveSearch(arr, target, mid + 1, high);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,12};
        int target = 12;
        System.out.println(search(arr, target));
        System.out.println(recursiveSearch(arr, target, 0, arr.length));
    }
}
