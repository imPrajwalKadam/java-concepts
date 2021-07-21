//Abstract methods

import java.lang.*;
abstract class Area
{
    public float Radius;
    public Area(float no)
    {
        Radius=no;
    }
    public abstract float calculateArea();//Abstract method
    public void display()//concrite method
    {
        System.out.println("Radious is:"+Radius);
    }
}
class calculation extends Area
{
    public calculation(float value)  //: Area(value)in c++
    {
        super (value);//call the parent class constructor

    }
public float calculateArea()
{
    return 3.14f*Radius*Radius;
}
}
class abstractdemo
{
    public static void main(String arg[])
    {
      // Area obj=new Area(3.5f);//NA 
      //Area obj=new abstract 
  
      calculation obj=new calculation(10.5f);
      float ret=obj.calculateArea();
      System.out.println("Area of circle is:"+ret);
    }
}
