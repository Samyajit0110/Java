package multithreading;

class A extends Thread {
    public void run()
    {
        String name = currentThread().getName();
        System.out.println(name+" is the name of the thread");
    }
}

public class ThreadCreation {
    public static void main(String[] args) {
        A thread1 = new A();
        A thread2 = new A();
        A thread3 = new A();
        thread1.setName("Thread1 ");
        thread2.setName("Thread2 ");
        thread3.setName("Thread3 ");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
