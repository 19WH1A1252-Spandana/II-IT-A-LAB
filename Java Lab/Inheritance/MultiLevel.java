class Base
{
    int a = 10;
}
class Child extends Base
{
    int b;
    void sum()
    {
      b = 20;
     System.out.println("sum:"+(a+b));
   }
}
class Child2 extends Child
{
   int c;
   void sum2()
   {
     c = 30;
     System.out.println("sum:"+(a+b+c));
   }
}
class MultiLevel
{
   public  static void main(String[] args)
{
    Child2 obj = new Child2();
    obj.sum();
    obj.sum2();
}
} 