//synchronization in multitheading

class Marvellous
{
   synchronized public void Display(String str)
    {
        System.out.print("{ "+str);
        try{
        Thread.sleep(5000);}
       catch(Exception obj){}
        System.out.println(" }");
    }
}
class Demo extends Thread{
    String message;
    Marvellous obj;//Composition
    public Demo(Marvellous ref,String s)
    {
        this.obj=ref;
        this.message=s;
    }
    public void run()
    {
        obj.Display(message);
    }
}
class Thread5
{
    public static void main(String arg[])throws Exception
    {
        System.out.println("Inside main thread");
        Marvellous mobj=new Marvellous();
        Demo obj1=new Demo(mobj,"Preplacement-Activity");
        Demo obj2=new Demo(mobj,"logic building");
        Demo obj3=new Demo(mobj,"Paython-muchine Learning");
       obj1.start();
       obj2.start();
       obj3.start();  
     }
}