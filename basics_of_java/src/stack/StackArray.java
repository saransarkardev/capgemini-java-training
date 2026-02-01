package stack;


public final class StackArray{
    private int top;
    private int[] stack;
    private int capacity;

    public StackArray(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive.");
        }
        this.top = -1;
        stack = new int[capacity];
        this.capacity = capacity;
    }


    public void push(int data) {
        if (top == capacity-1) {
            throw new IllegalStateException("Stack overflow");
        }

        stack[++top] = data;
    }

    public int pop() {
        if (top == -1) {
            throw new IllegalStateException("Stack underflow");
        }

        return stack[top--];
    }

    public int peek() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty");
        }

        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity-1;
    }

    public int size() {
        return top+1;
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i=top; i>=0; i--) {
            System.out.print(stack[i]+ " ");
        }
        System.out.println();
    }
}
