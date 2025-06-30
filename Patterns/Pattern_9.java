/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */

import java.util.Scanner;

public class Pattern_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i <= n;i++) {
            for(int j = 1;j <= i;j++)
                System.out.print(j + " ");
            System.out.println();
        }
        n -= 1;
        for(int i = n;i >= 1;i--) {
            for(int j = 1;j <= i;j++)
                System.out.print(j + " ");
            System.out.println();
        }
        sc.close();
    }
}
