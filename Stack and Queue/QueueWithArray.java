public class QueueWithArray {
    int front = -1,rear = -1,currSize = 0,totalSize = 10;
    int[] arr;

    public QueueWithArray(){
        arr = new int[10];
    }

    public void push(int a) {
        if(currSize == totalSize)
            System.out.println("Queue is already full");
        if(currSize == 0){
            front = 0;
            rear = 0;
        }
        else    
            rear = (rear + 1) % totalSize;
        currSize++;
        arr[rear] = a;
    }

    public void pop() {
        if(currSize == 0)
            System.out.println("Queue is empty");
        if(currSize == 1){
            rear = -1;
            front = -1;
        }
        else
            front = (front + 1) % totalSize;
        currSize--;
    }
    public int peek() {
        if(currSize == 0){
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        return arr[front];
    }
    public int size(){
        return currSize;
    }

    public static void main(String[] args) {
        QueueWithArray queue = new QueueWithArray();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.size());
        System.out.println(queue.peek());
        queue.pop();
        System.out.println(queue.peek());
    }
    
}
