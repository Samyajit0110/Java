package queues;

public class QueueArray {
    int front, rear, MAX;
    int[] queue;

    QueueArray(int MAX) {
        this.MAX = MAX;
        front = rear = -1;
        queue = new int[MAX];
    }

    boolean overflow() {
        return rear == MAX - 1;
    }

    boolean underflow() {
        if (front == -1 || rear + 1 == front) {
            return true;
        }
        return false;
    }

    void enqueue(int data) {
        if (overflow()) {
            System.out.println("Queue overflow");
            return;
        }
        if (underflow()) {
            queue[++rear] = data;
            front = 0;
            return;
        }
        queue[++rear] = data;
    }

    int dequeue() {
        if (underflow()) {
            System.out.println("Queue underflow");
            return -1;
        }
        return (queue[front++]);
    }

    void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    void peek() {
        System.out.println(queue[front]);
    }

//    public static void main(String[] args) {//runner code for testing
//        QueueArray qa = new QueueArray(10);
//        for (int i = 0; i < 10; i++) {
//            qa.enqueue(i);
//        }
//        while (!qa.underflow()) {
//            int popped = qa.dequeue();
//            System.out.print(popped + " ");
//        }
//        System.out.println();
//    }
}
