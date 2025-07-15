import java.util.Arrays;
import java.util.Scanner;
/*
 * Given a available cookies and greedy factor of children who accept cookies greater than or equal to their 
 * greedy factor. Find the maximum number of children get cookies
 */
public class Q1AssignCookies { 
    public static int assignCookies(int[] greedy,int[] cookies) {
        int r = 0,l = 0;
        Arrays.sort(cookies);
        Arrays.sort(greedy);
        while(l < cookies.length && r < greedy.length) {
            if(cookies[l] >= greedy[r]) {
                r++;
                l++;
            }
            else {
                l++;
            }

        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ng = sc.nextInt();
        int[] greedy = new int[ng];
        for(int i = 0;i < ng;i++)
            greedy[i] = sc.nextInt();
        int nc = sc.nextInt();
        int[] cookies = new int[nc];
        for(int i = 0;i < nc;i++)
            cookies[i] = sc.nextInt();
        System.out.println(assignCookies(greedy, cookies));
        sc.close();        
    }
}
