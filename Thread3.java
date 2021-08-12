class Demo extends Thread
{
    public void run()
    {
     System.out.println("Priority of thread is:"+Thread.currentThread().getPriority());
    }
}
class Thread3
{
    public static void main(String arg[])
    {
        System.out.println("Inside main Thread");
        Thread t=new Thread(new Demo());

        t.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t.getPriority());

        t.setPriority(Thread.NORM_PRIORITY);
        System.out.println(t.getPriority());

        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t.getPriority());

      t.start();       
    }
}