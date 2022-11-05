package stacks;

public class StackArray {
    int top, MAX, elements_so_far;
    int[] stack;

    StackArray(int MAX) {
        top = -1;
        this.MAX = MAX;
        stack = new int[MAX];
    }

    boolean overFlow() {
        return top == MAX - 1;
    }

    boolean underFlow() {
        return top == -1;
    }

    void push(int data) {
        if (overFlow()) {
            System.out.println("Stack overflow");
            return;
        }
        stack[++top] = data;
    }

    int pop() {
        if (underFlow()) {
            System.out.println("Stack underflow");
            return -1;
        }
        return (stack[top--]);
    }

    void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    void peek() {
        System.out.println(stack[top]);
    }

//    public static void main(String[] args) {//runner code for testing
//        StackArray sa = new StackArray(10);
//        for (int i = 0; i < 10; i++) {
//            sa.push(i);
//        }
//        while (!sa.underFlow()) {
//            int result = sa.pop();
//            System.out.print(result + " ");
//        }
//        System.out.println();
//    }
}
