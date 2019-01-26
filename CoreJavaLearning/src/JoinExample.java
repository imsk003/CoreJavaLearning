import java.lang.*;

public class JoinExample implements Runnable
{
    public void run()
    {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t.getName());

       System.out.println("Is Alive? " + t.isAlive());
    }

    public static void main(String args[]) throws Exception
    {
        Thread t = new Thread(new JoinExample());
        t.start();

        t.join(1000);

        System.out.println("\nJoining after 1000"+ " mili seconds: \n");
        System.out.println("Current thread: " + t.getName());

        System.out.println("Is alive? " + t.isAlive());
    }
}
