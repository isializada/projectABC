public class MyStack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public static void main(String[] args) {
        MyStack theStack = new MyStack(10);
        theStack.push(10);
        theStack.push(20);
        theStack.push(30);
        theStack.push(40);
        theStack.push(50);

        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }

    MyStack(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }
    void push(long j) {
        stackArray[++top] = j;
    }
    long pop() {
        return stackArray[top--];
    }
    long peek() {
        return stackArray[top];
    }
    boolean isEmpty() {
        return (top == -1);
    }
    boolean isFull() {
        return (top == maxSize - 1);
    }

}