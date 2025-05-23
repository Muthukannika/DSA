import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static boolean isSet(int n,int i){
        return (n & (1 << i)) != 0;
    }
    public static List<List<Integer>> powerSet(int[] arr){
        List<List<Integer>> lists = new ArrayList<>();
        int n = 1 << arr.length;
        for(int i = 0;i < n;i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0;j < arr.length;j++){
                if(isSet(i, j))
                    list.add(arr[j]);
            }
            lists.add(list);
        }
        return lists;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(powerSet(arr));
    }
}
