import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Interval {
    int start;
    int end;
    Interval(int start,int end) {
        this.start = start;
        this.end = end;
    }
}
public class Q8NonOverlappingIntervals {
    public static int minimumIntervalsRemoved(List<Interval> list) {
        Collections.sort(list,new Comparator<Interval>() {
            public int compare(Interval a,Interval b) {
                return a.end - b.end;
            }
        });
        int count = 0,freeTime = 0;
        for(Interval interval : list) {
            if(interval.start >= freeTime) {
                count += 1;
                freeTime = interval.end;
            }
        }
        return list.size() - count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Interval> list = new ArrayList<>();
        for(int i = 0;i < n;i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            list.add(new Interval(start, end));
        }
        System.out.println(minimumIntervalsRemoved(list));
        sc.close();
    }
}
