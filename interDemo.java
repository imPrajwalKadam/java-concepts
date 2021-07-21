/*
 An interface is a specifacitoin of method prototypes. All the methods of the interfaces are public and abstract.
 
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


interface Figures
{
    public float PI=3.14f;

    public float Area(float radious);
    public float Circumfarence(float radious); 
}
class Circle implements Figures
{
    public float Area(float radious)

    {
        return PI*radious*radious;
    }
    public float Circumfarence(float radious)
    {
        return 2*PI*radious;
    }
}
class interDemo
{
    public static void main(String arg[])
    {
      Circle obj=new Circle();
      System.out.println("Area is:"+obj.Area(10.5f));
      System.out.println("Circumfarence is:"+obj.Circumfarence(10.5f));
      System.out.println("Value of PI is:"+Figures.PI);
    }
}