public class Queue {
    private int[] q;
    private int qSize = 4;
    private int head;
    private int tail;
    int num;
    public Queue() {
        q = new int[qSize];
        head = -1;
        tail = -1;
        int num = 0;
    }

    //METHODS
    public boolean isFull() {
        if (num > 3)
            return true;
        else
            return false;
    }
    public boolean isEmpty() {
        if (num <= 0)
            return true;
        else
            return false;
    }
    public void enqueu(int el) {
        if (isFull() == true ){
            System.out.println("Queue is full");
        }else{
            num++;
            tail++;
            q[tail] = el;
        }
    }
    public int  dequeue() {
        int result1=0;
        if (isEmpty()==true) {
            System.out.println("Queue is empty");
        }else{
            num--;
            result1 = q[head];
            head++;
        }
        return result1;
    }


}
