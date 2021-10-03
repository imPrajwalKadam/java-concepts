// Write a program 2 show haw to terminate a thread by pressing the enter button
import java.io.*;
class myClass implements Runnable
{
     boolean stop = false;
     public void run()
     {
          for(int i = 1; i<100;i++)
          {
               System.out.println(i);
               try{
                    Thread.sleep(400);
                  }
                  catch(InterruptedException IT) {}  
               if(stop)return;  //come out of run
          }
     }
}

 class Thread9
{
     public static void main(String arg[])throws IOException
     {
          myClass mObj1 = new myClass();
          myClass mObj2 = new myClass();
          Thread t1 = new Thread(mObj1);
          Thread t2 = new Thread(obj2);
          
          t1.start();
          t2.start(); 
          //Stop the thread when Enter Key is Pressed.
          System.in.read();//Wait till Enter Key Press.
          mObj1.stop = true;
          System.out.println("Thread Is terminated...");
     }
} 
