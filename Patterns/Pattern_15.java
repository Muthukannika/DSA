/*
7 6 5 4 3 2 1 
  6 5 4 3 2 1 
    5 4 3 2 1 
      4 3 2 1 
        3 2 1 
          2 1 
            1 
 */

import java.util.Scanner;

public class Pattern_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n;i >= 1;i--) {
            int space = n - i;
            for(int s = 1;s <= space;s++)
                System.out.print("  ");
            for(int j = i;j >= 1;j--)
                System.out.print(j + " ");
            System.out.println();
        }
        sc.close();
    }
}
