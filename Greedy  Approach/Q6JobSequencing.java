import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Job {
    int id;
    int deadline;
    int profit;
    Job(int id,int deadline,int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}
public class Q6JobSequencing {
    
    public static void sequenceJobs(List<Job> list) {
        Collections.sort(list,new Comparator<Job>() {
            public int compare(Job a,Job b) {
                if(a.profit != b.profit)
                    return Integer.compare(b.profit, a.profit);
                else if(a.deadline != b.deadline)
                    return Integer.compare(b.deadline, a.deadline);
                else
                    return Integer.compare(b.id,a.id);
            }
        });
        int maxDeadline = Integer.MIN_VALUE,totalProfit = 0,count = 0;
        for(Job j : list) 
            maxDeadline = Math.max(maxDeadline, j.deadline);
        int[] map = new int[maxDeadline + 1];
        for(int i = 0;i <= maxDeadline;i++)
            map[i] = -1;
        for(int i = 0;i < list.size();i++) {
            for(int j = list.get(i).deadline;j > 0;j--) { //This loop is avoided by DSU 
                if(map[j] == -1) {
                    count += 1;
                    map[j] = list.get(i).id;
                    totalProfit += list.get(i).profit;
                    break;
                }
            }
        }
        System.out.println("Number of jobs done : " + count);
        System.out.println("Job sequence : " + Arrays.toString(map));
        System.out.println("Maximum profit : " + totalProfit);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Job> list = new ArrayList<>();
        for(int i = 0;i < n;i++) {
            int id = sc.nextInt();
            int deadline = sc.nextInt();
            int profit = sc.nextInt();
            list.add(new Job(id, deadline, profit));
        }
        sequenceJobs(list);
        sc.close();
    }
}
