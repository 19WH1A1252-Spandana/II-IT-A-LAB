import java.util.Scanner;
class Circle{
     public static void main(String args[]){
     double r,area,circum;
     Scanner obj = new Scanner(System.in);
      System.out.println("Enter the radius of the circle: ");
     r = obj.nextDouble();
     area = 3.14*r*r;
     circum = 2*3.14*r;
     System.out.println("Area of a circle is "+area);
       System.out.println("Circumference of a circle is "+ circum);
      }
}