/*
            1 
          1 2 
        1 2 3 
      1 2 3 4 
    1 2 3 4 5 
  1 2 3 4 5 6 
1 2 3 4 5 6 7 
 */
import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i <= n;i++) {
            int space = (n - i) * 2;
            for(int s = 1;s <= space;s++)
                System.out.print(" ");
            for(int j = 1;j <= i;j++)
                System.out.print(j + " ");
            System.out.println();
        }
        sc.close();
    }
}
