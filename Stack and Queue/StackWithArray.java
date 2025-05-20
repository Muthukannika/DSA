public class StackWithArray{
    static int top = -1;
    int[] arr;
    public StackWithArray() {
        arr = new int[10];
    }
    public void push(int a){
        if(top == arr.length)
            System.out.println("Stack overflow");
        arr[++top] = a;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public void pop(){
        if(isEmpty())
            System.out.println("Stack has no elements");
        else
            --top;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack has no elements");
            return Integer.MIN_VALUE;
        }
        else
            return arr[top];
    }
    public int size(){
        return top + 1;
    }
    public static void main(String[] args) {
        StackWithArray stack = new StackWithArray();
        stack.push(1);
        stack.push(4);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());

    }

}