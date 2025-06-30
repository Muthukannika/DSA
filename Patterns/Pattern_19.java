/*
      1 
     2 2 
    3 3 3 
   4 4 4 4 
  5 5 5 5 5 
 6 6 6 6 6 6 
7 7 7 7 7 7 7 

 */

import java.util.Scanner;

public class Pattern_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i <= n;i++) {
            for(int s = 1;s <= n - i;s++)
                System.out.print(" ");
            for(int j = 1;j <= i;j++)
                System.out.print(i + " ");
            System.out.println();
        }
        sc.close();
    }    
}
