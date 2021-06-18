class Base
{
   void Base123()
   {
      System.out.println("Base class");
   }
}
class Child extends Base
{
    void Base123()
    {
        super.Base123();
     }
    
}
class MethodOver1
{
    public static void main(String[] args)
    {
       Child obj = new Child();
       obj.Base123();
    }
}