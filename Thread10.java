import java.io.IOException;

//Write a program showing a execution multiple task with a single thread

class myThread extends Thread
{
     public int iNo1 = 5;
     public int iNo2 = 2;
     public int iResult;
     public void run()
     {
          //execute the task one by one by calling the method
          task1();
          task2();
          task3();
     }

     void task1()
     {
          System.out.println("Task one");
          iResult = iNo1 + iNo2;
          System.out.println("Addition is:" + iResult);
     }
     void task2()
     {
          System.out.println("task Two");
          iResult = iNo1 - iNo2;
          System.out.println("Substraction is:" + iResult);
     }
     void task3()
     {
          System.out.println("task three");
          iResult = iNo1 / iNo2;
          System.out.println(("Division is:"+ iResult));
     }
}

class Thread10
{
     public static void main(String[] arg) throws IOException
     {
          myThread mObj = new myThread();
          Thread t = new Thread(mObj);
          t.start();
     }
}