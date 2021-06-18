class Base
{
  int a = 10;
}
class Child extends Base
{
   int b = 20;
   void sum()
{
   System.out.println("sum:"+(a+b));
}
}
class Child2 extends Base
{
   int c;
   void mul()
{
   int c = 30;
   System.out.println("Mul:"+(a*c));
}
}
class Hierarchical
{
    public static void main(String[] args)
{
    Child obj = new Child();
    Child2 obj2 = new Child2();
    obj.sum();
    obj2.mul();
}
}