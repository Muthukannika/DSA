/*
 * Given an two arrays in sorted merge them to find the union of both
 * Brute force : Put all the elements in the set and return the set as array
 *      => Time complexity : O(n1 log n) + O(n2 log n) n -> size of set  Space complexity : O(n1 + n2)
 * Optimal : Traverse both the arrays using two pointers by comparing the elements and sorting add the elements
 *      => Time complexity : O(n1 + n2)  Space complexity : O(n1 + n2)
 */

import java.util.ArrayList;
import java.util.List;

public class Union {
    public static void union(int[] arr1,int[] arr2){
        List<Integer> list = new ArrayList<>();
        int i = 0,j = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                if(list.size() == 0 || list.get(list.size() - 1) != arr1[i])
                    list.add(arr1[i]);
                i++;
            }
            else{
                if(list.size() == 0 || list.get(list.size() - 1) != arr2[j])
                    list.add((arr2[j]));
                j++;
            }
        }
        while(i < arr1.length){
            if(list.size() == 0 || list.get(list.size() - 1) != arr1[i])
                list.add(arr1[i]);
            i++;
        }
        while (j < arr2.length){
            if(list.size() == 0 || list.get(list.size() - 1) != arr2[j])
                list.add(arr2[j]);
            j++;
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5,6};
        union(arr1, arr2);
    }
}
