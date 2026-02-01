package queue;


public final class QueueArray{

    private int front;
    private int rear;
    private int[] queue;
    private int capacity;
    private int size;

    public QueueArray(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive.");
        }
        this.front = 0;
        this.rear = -1;
        queue = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    // add an element in the queue from rear
    public void enqueue(int data) {
        if (capacity == size) {
            throw new IllegalStateException("Queue overflow");
        }

        rear = (rear+1)%capacity;
        queue[rear] = data;
        size++;
    }

    // remove an element from the queue from front
    public int dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue underflow");
        }

        int removedData = queue[front];
        front = (front+1)%capacity;
        size--;

        if (size == 0) {
            front = 0;
            rear = -1;
        }


        return removedData;
    }

    public int peek() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }

        return queue[front];
    }
    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void display() {
        
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }

        for (int i=0; i<size; i++) {
            int index = (front+i)%capacity;
            System.out.print(queue[index]+ " ");
        }
        System.out.println();
    }


}