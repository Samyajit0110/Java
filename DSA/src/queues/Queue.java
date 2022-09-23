package queues;

class Queue_Array {
    int front = -1, rear = -1;
    int[] queue = new int[100];

    boolean underFlow() {
        if (front == -1 && rear == -1) {
            return true;
        }
        if (front == rear) {
            front = rear = -1;
            return true;
        }
        return false;
    }

    boolean overFlow() {
        return rear == 100;
    }

    void push(int data) {
        if (front == -1 && rear == -1) {
            queue[++rear] = data;
            front = rear;
        } else {
            if (!overFlow())
                queue[++rear] = data;
            else {
                System.out.println("queues.Queue overflow");
                return;
            }
        }
    }

    int pop() {
        if (underFlow()) {
            System.out.println("queues.Queue is empty");
            return -1;
        } else {
            return front++;
        }
    }
}

public class Queue extends Queue_Array {
    public static void main(String[] args) {
        Queue queue = new Queue();
        int i, data;
        for (i = 0; i < 10; i++) {
            queue.push(i);
        }
        System.out.println("popping elements");
        while (true) {
            if (queue.pop() == -1) {
                System.out.println("queues.Queue is empty");
            } else {
                System.out.println(queue.pop());
            }
        }
    }
}