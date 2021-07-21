/*
   one interface can extends another interface. In this cinario the class which is going to impliment  that 
   interface has to define all the methods

    
 ||  REAL LIFE EXAMPLE OF INTERFACE  ||

 Suppose, you have some rupees in your hand. you can spend in rupees only by going to a shope where  billing is 
 done in rupees .Suppose you have gone to shope where only dollars are accepted you can not use your rupees there.
 This mony is like a 'Class'.It is not usefull to handle a different situation.
 
 suppose, you have a credit card .Now, you can pay by using your credit card in supees in a shope. if you go to 
 another shope where they expect you to pay in dollers, you can pay in dollers. The same credit card can  can be
 use to pay in pounds also.Here, the credit card  is like an interface which performs diffferent task. In fact,
 credit card is just a plastic card it does not hold money phisically.it just contains Your name ,your bank name
 and some numbers

*/ 


import java.lang.*;

interface Maths1
{
    int Add(int no1,int no2);
}
interface Maths2 extends Maths1
{
  int Sub(int no1,int no2);
}
class Demo implements Maths2
{
    public int Add(int no1,int no2)
    {
        return no1+no2;
    }
    public int Sub(int no1,int no2)
    {
        return no1-no2;
    }  
}
class interDemo2
{

    public static void main(String arg[])
    {
    
    Demo obj=new Demo();
    
    System.out.println("Addition is."+obj.Add(5,2));

    System.out.println("Substraction is."+obj.Sub(15,5));
    }
    
}