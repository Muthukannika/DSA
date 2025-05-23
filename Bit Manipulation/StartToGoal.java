public class StartToGoal {
    public static int minBits(int start,int goal){
        int res = start ^ goal;
        int count = 0;
        while(res != 0){
            count++;
            res = res & (res - 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int start = 3,goal = 4;
        System.out.println(minBits(start, goal));
    }
}
