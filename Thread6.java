import java.util.*;


//two threads performing two task at a time
class  MyThread extends Thread
{
    //declare a string to represents the task
    String str;
    MyThread(String str)
    {
        this.str=str;
    }
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(str+ " : " +i);
            try{
                Thread.sleep(200);
                //cease thread execution for 2000 milliseconds 
            }
            catch(InterruptedException ie)
            {
                ie.printStackTrace();
            }//End of for
        }

    }//end of run()
}
class Thread6
{
    public static void main(String arg[])
    {
        //Create two object to represent two task
        MyThread obj1=new MyThread("Cut the ticket");
        MyThread obj2=new MyThread("Show the seat");

        //Create two thread and attached two object\
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        //start the thread
        t1.start();
        t2.start();
    }
}