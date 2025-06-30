/*
1234567
 234567
  34567
   4567
    567
     67
      7
     67
    567
   4567
  34567
 234567
1234567
 */

import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i <= n;i++) {
            for(int s = 1;s < i;s++)
                System.out.print(" ");
            for(int j = i;j <= n;j++)
                System.out.print(j);
            System.out.println();
        }
        for(int i = n - 1;i >= 1;i--) {
            int space =  i - 1;
            for(int s = 1;s <= space;s++)
                System.out.print(" ");
            for(int j = i;j <= n;j++)
                System.out.print(j);
            System.out.println();
        }
        sc.close();
    }
}
