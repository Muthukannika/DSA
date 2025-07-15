public class Q11ValidateParentheses {
    public static boolean recursiveSolution(String s,int index,int count) {
        if(count < 0)   return false;
        if(index == s.length()) {
            if(count == 0)  return true;
            return false;
        }
        if(s.charAt(index) == '(')  return recursiveSolution(s, index + 1, count + 1);
        else if(s.charAt(index) == ')')     return recursiveSolution(s, index + 1, count - 1);
        else return recursiveSolution(s, index + 1, count + 1) || recursiveSolution(s, index + 1, count) || recursiveSolution(s, index + 1, count - 1);
    }
    // public static boolean dynamicProgrammingSolution(String s) {

    // }

    public static boolean optimalSolution(String s) {
        int min = 0,max = 0;
        for(char c : s.toCharArray()) {
            if (c == '(') {
                min++;
                max++;
            }
            else if (c == ')') {
                min--;
                max--;
            }
            else {
                min--;
                max++;
            }
            if(min < 0)     min = 0;
            if(max < 0)     return false;
        }
        return min == 0;
    }
    public static void main(String[] args) {
        String s = "(*()";
        System.out.println(recursiveSolution(s, 0, 0));
        System.out.println(optimalSolution(s));
    }
}
