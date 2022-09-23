package multithreading;
class Bank implements Runnable
{
    int amount_available = 10000;
    int loan;
    Bank(int loan)
    {
        this.loan = loan;
    }
    public synchronized void run()
    {
        String name = Thread.currentThread().getName();
        amount_available -= loan;
        if(amount_available>0) {
            System.out.println(name + " has received the loan of " + loan);
            System.out.println("remaining amount = "+amount_available);
        }
        else
            System.out.println("No loan available");
    }
}
public class SynchronizedThreads {
    public static void main(String[] args) {
        Bank bank = new Bank(4000);
        Thread t1 = new Thread(bank);
        Thread t2 = new Thread(bank);
        Thread t3 = new Thread(bank);
        t1.setName("Person1");
        t2.setName("Person2");
        t3.setName("Person3");
        t1.start();
        t2.start();
        t3.start();
    }
}
