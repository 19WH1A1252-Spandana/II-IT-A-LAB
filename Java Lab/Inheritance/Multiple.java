interface Printable
{
   int a = 10;
}
interface Showable
{
   int b = 20;
}
class Child implements Printable,Showable
{
     public void mul()
{
   int c = 30;
   System.out.println("Multiplication:"+(a*b*c));
}
}
class Multiple
{
    public static void main(String args[])
{
   Child obj = new Child();
   obj.mul();
}
}