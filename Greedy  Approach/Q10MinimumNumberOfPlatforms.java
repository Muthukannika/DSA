import java.util.Arrays;

public class Q10MinimumNumberOfPlatforms {
    public static int brute(int[] arr,int[] dep) {
        int maxCount = 0;
        int count;
        for(int i = 0;i < arr.length;i++) {
            count = 1;
            for(int j = i + 1;j < arr.length;j++) {
                if (arr[i] > arr[j] && dep[i] > dep[j]) {
                    count++;
                    System.out.println(i + " " + j + " is coliding");
                    System.out.println("condition 1");
                }
                else if (arr[i] < arr[j] && dep[i] < dep[j]) {
                    count++;
                    System.out.println(i + " " + j + " is coliding");
                    System.out.println("condition 2");
                }
                else if (arr[i] > arr[j] && dep[i] < dep[j]) {
                    count++;
                    System.out.println(i + " " + j + " is coliding");
                    System.out.println("condition 3");
                }
                else if(arr[i] < arr[j] && dep[i] > dep[j]) {
                    count++;
                    System.out.println(i + " " + j + " is coliding");
                    System.out.println("condition 4");
                }
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
    public static int better(int[] arrival,int[] departure) {
        int maxCount = 0;
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int i = 0,j = 0;
        int c = 0;
        while(i < arrival.length || j < arrival.length) {
            if(i < arrival.length && arrival[i] < departure[j]) {
                c++;
                i++;
            }
            else if(j < departure.length) {
                c--;
                j++;
            }
            maxCount = Math.max(maxCount, c);
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int[] arr = {900,945,955,1100,1500,1800};
        int[] dep = {920,1200,1130,1150,1900,2000};
        System.out.println(better(arr, dep));
    }
}