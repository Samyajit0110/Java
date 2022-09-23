package stacks;

class Stack_Array {
    int top = -1;
    int[] stack = new int[100];

    boolean underFlow() {
        return top == -1;
    }

    boolean overFlow() {
        return top == 100;
    }

    void push(int data) {
        if (overFlow()) {
            System.out.println("stacks.Stack overflow");
        }
        stack[++top] = data;
    }

    int pop() {
        if (underFlow()) {
            return -1;
        }
        return stack[top--];//to be checked
    }

    void peek() {
        System.out.println(stack[top - 1]);
    }
}

class Stack extends Stack_Array {
    public static void main(String[] args) {
        Stack stack = new Stack();
        int i, data;
        for (i = 0; i < 10; i++) {
            stack.push(i);
        }
        System.out.println("Popping elements");
        while (true) {
            if (stack.pop() == -1) {
                System.out.println("stacks.Stack is empty now");
                break;
            }
            System.out.println(stack.pop());
        }
    }
}