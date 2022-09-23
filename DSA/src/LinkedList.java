class Node {
    int data;
    Node next;

    Node() {
        data = -1;
        next = null;
    }

    Node(int data) {

        this.data = data;
        this.next = null;
    }
}

class List extends Node {
    Node head;
    Node tail;

    List() {
    }

    boolean isEmpty() {
        if (this.head == null) {
            return true;
        } else {
            return false;
        }
    }

    void printList() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node temp = this.head;
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    void addNode(int data) {
        Node temp = new Node(data);
        temp.next = null;
        if (head == null) {
            this.head = temp;
            this.tail = temp;
        } else {
            this.tail.next = temp;
            this.tail = temp;
        }
    }

    void deleteNode(int data) {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            Node Prev, Next;
            if (data == 0) {
                head = head.next;
            } else {
                while ((temp.next).data != data) {
                    temp = temp.next;
                }
                Prev = temp;
                Next = temp.next.next;
                Prev.next = Next;
            }
        }
    }
}

public class LinkedList extends List {
    public static void main(String[] args) {
        List list = new List();
        for (int i = 0; i < 10; i++) {
            list.addNode(i);
        }
        list.deleteNode(8);
        list.printList();
    }
}
