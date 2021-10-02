import java.io.IOException;

class Hello implements Runnable// extends Thread
{
    public void run() 
    {
        for(int i = 1;i <= 10; i++)
        {
            System.out.println("Inside  Thread :" + Thread.currentThread().getName() + ":" + i);
            try
            {
            Thread.sleep(500);
            }
            catch(InterruptedException hi){}
        }
    }
}
class Thread8
{
    public static void main(String[] arg)
    {
        System.out.println("inside main Thread");
        Hello sobj1 = new Hello();
        Hello sobj2 = new Hello();

        Thread t1 = new Thread(sobj1);
        Thread t2 = new Thread(sobj2);

       t1.setPriority(3);
       t2.setPriority(Thread.MAX_PRIORITY);

        t1.setName("Loading");
        t2.setName("Processing");       
               try{
       t1.start();
       t2.start();
       t1.join();
       t2.join();
       }
       catch(InterruptedException IO){}
    }
}