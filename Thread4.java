class Demo extends Thread
{ 
  synchronized  public void run()
    {
        System.out.println("Thread Scheduled");
         for(int i=1;i<=100;i++)
        {
            System.out.println("Value:"+i);
        }       
    }
}
class Thread4
{
    public static void main(String arg[])throws Exception
    {
        System.out.println("Inside main thread");
        Thread t1=new Thread(new Demo());
        Thread t2=new Thread(new Demo());
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        System.out.println("End of main");
     }

}