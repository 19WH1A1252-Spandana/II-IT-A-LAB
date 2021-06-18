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
   int c = 30;
   
}
class Child3 extends Child2
{
   
void mul()
{
   int c = 30;
   System.out.println("Mul:"+(a*c));
}
    
}

class Hybrid
{
    public static void main(String[] args)
{
    Child obj = new Child();
    Child3 obj2 = new Child3();
    obj.sum();
    obj2.mul();
}
}