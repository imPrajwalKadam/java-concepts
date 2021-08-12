import java.lang.*;

class Demo
{
    public int x,y;

   public Demo()
    {
    System.out.println("Default constructor");
    }
    public Demo(int a,int b)
    {
        this();
        System.out.println("Paramiterised constructor");
        this.x=a;
        this.y=b;

    }

    public void fun()
    {
      System.out.println("Value if x is:"+this.x);
        }
}
class Thisdemo
{
    
    public static void main(String arg[])
    {
     Demo obj1 =new Demo();
     Demo obj2 =new Demo(11,21);
     obj1.fun();
    }
}