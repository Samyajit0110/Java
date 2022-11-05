package queues;

public class PriorityQueue {
    int MAX, elements_so_far;
    int[] queue;

    PriorityQueue() {
        MAX = 10;
        queue = new int[10];
        elements_so_far = 0;
    }

    void push(int data) {
        int i;
        if (elements_so_far == 0) {
            queue[0] = data;
        }
        else {
            for (i = elements_so_far - 1; i >= 0; i--) {
                if (queue[i] > data) {
                    queue[i + 1] = queue[i];
                }
            }
            queue[i + 1] = data;
        }
        elements_so_far++;
    }

    int pop() {
        return --elements_so_far;
    }

    void display()
    {
        for(int i = 0;i<10;i++)
        {
            System.out.printf(queue[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        for(int i = 9;i>=0;i--)
        {
            pq.push(i);
        }
        pq.display();
    }
}