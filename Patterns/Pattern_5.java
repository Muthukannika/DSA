/*
7
7 6
7 6 5
7 6 5 4
7 6 5 4 3
7 6 5 4 3 2
7 6 5 4 3 2 1
 */
import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n;i >= 1;i--) {
            for(int j = n;j >= i;j--)
                System.out.print(j + " ");
            System.out.println();
        }
        sc.close();
    }
}
