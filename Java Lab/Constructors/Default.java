class Base
{
   Base()
   {
     System.out.println("Base class");
   }
}
class Child extends Base
{
  Child()
  {
     System.out.println("Child class");
}
}
class Default
{
    public static void main(String[] args)
    {
        Child obj = new Child();
}
}