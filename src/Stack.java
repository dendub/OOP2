public class Stack {
    //FIRST IN - LAST OUT
    private int[] array;
    private int size =10;
    private int top;

    public Stack() {
        array=new int[size];
        top = -1;
    }
    //METHODS
    public int pop() {
        int result =0;
        if (top >= 0) {
             result = array[top];
             top--;
        }else{
            System.out.println("Stack is empty");
        }
        return result;
    }

    public void push(int element) {
        if (top <= size -2) {
            top++;
            array[top] = element;
        }else{
            System.out.println("Stack is full");
        }
    }
}
