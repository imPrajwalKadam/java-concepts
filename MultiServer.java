/*
write a program which create a server with two threads which communicate a several clients
*/
import java.io.*;
import java.net.*;

class MultiServer implements Runnable
{
     static ServerSocket ss;

     static Socket s;

    public void run()
    {
         //find thread name
         String name  = Thread.currentThread().getName();
         for(;;)
         {
              try{
                   System.out.println("Thread "+name+" ready to accept ...");
                   s = ss.accept();
                   System.out.println("Thread " +name+ " accept a connection");
                   //for sending a message
                   PrintStream ps = new PrintStream(s.getOutputStream());
                   ps.println("Thread " +name+ " contacted you");

                   //close connection
                   ps.close();
                   s.close();
                   //do not close ServerSocket
          
              catch(IOException ie){}
         }
    }
     public static void main(String[] args)throws IOException
    {

          MultiServer ms = new MultiServer();
          //create ServerSocket with 999 port number
          ss = new ServerSocket(999);
          
          //create two Thread
          Thread t1 = new Thread(ms,"  one ");
          Thread t2 = new Thread(ms," two ");

          //Start the thread
          t1.start();
          t2.start();
    }
}