import java.util.Scanner;
/*
 * A lemonade's cost is 5. Given a number of denominations by customers find is it possible to sell or all
 * Customer give either 5 or 10 or 20. If he gives 10 you have to give remaining 5 and if 20 give remaining 15 
 * (10 + 5 || 5 + 5 + 5)
 */
public class Q2LemonadeChange {
    public static boolean isPossibleToSell(int[] arr) {
        int five = 0,ten = 0,twenty = 0;
        for(int i = 0;i < arr.length;i++) {
            if(arr[i] == 5)
                five++;
            else if(arr[i] == 10) {
                if(five == 0)   return false;
                five--;
                ten++;
            }
            else if(arr[i] == 20) {
                if(ten > 0 && five > 0) {
                    ten--;
                    five--;
                    twenty++;
                }
                else if(five >= 3) {
                    five -= 3;
                    twenty++;
                } 
                else
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++)
            arr[i] = sc.nextInt();
        System.out.println(isPossibleToSell(arr));
        sc.close();
    }
}