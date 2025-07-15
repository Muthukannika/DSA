import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Meeting {
    int id;
    int start;
    int end;
    Meeting(int id,int start,int end) {
        this.id = id;
        this.start = start;
        this.end = end;
    }
    public String toString() {
        return "Id : " + this.id +" start : " + this.start + " end : " + end;
    }
}

public class Q7NMeetingOneRoom {

    public static void allocateMeetings(List<Meeting> list) {
        Collections.sort(list,new Comparator<Meeting>() {
            @Override
            public int compare(Meeting a,Meeting b) {
                return a.end - b.end;
            }
        });
        // for(Meeting m : list) {
        //     System.out.println(m);
        // }
        int freeTime = 0,count = 0;
        List<Integer> order = new ArrayList<>();
        for(Meeting m : list) {
            if(m.start > freeTime) {
                count += 1;
                freeTime = m.end;
                order.add(m.id);
            }
        }
        System.out.println("Number of meetings done : " + count);
        System.out.println("Order of meeting id : " + order);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number of meetings : ");
        int n = sc.nextInt();
        List<Meeting> list = new ArrayList<>();
        for(int i = 0;i < n;i++) {
            // System.out.println("Start for " + i);
            int start = sc.nextInt();
            // System.out.println("End for " + i);
            int end = sc.nextInt();
            list.add((new Meeting(i + 1, start, end)));
            // System.out.println("Added " + i);
        }
        allocateMeetings(list);
        sc.close();
                
    }
}
