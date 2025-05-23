public class FloorCeil {
    public static int ceil(int[] arr,int target){
        int low = 0,high = arr.length;
        int mid = 0,ans = Integer.MAX_VALUE;
        while (low < high) {
            mid = low + (high - low) / 2;
            if(arr[mid] >= target){
                ans = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return arr[ans];
    }
    public static int floor(int[] arr,int target){
        int low = 0,high = arr.length;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] <= target){
                ans = mid;
                low = mid + 1;
            }
            else
                high = mid - 1;
        }
        return arr[ans];
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target = 25;
        System.out.println(ceil(arr, target));
        System.out.println(floor(arr, target));
    }
}