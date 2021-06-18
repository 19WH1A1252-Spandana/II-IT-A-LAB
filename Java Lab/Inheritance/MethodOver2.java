class Base
{
   void show()
{
System.out.println("Base class");
}
}
class Child extends Base
{

  void show()
{
  System.out.println("Child Class");
}
}
class MethodOver2
{
public static void main(String[] args)
{
Child obj = new Child();
obj.show();
}
}