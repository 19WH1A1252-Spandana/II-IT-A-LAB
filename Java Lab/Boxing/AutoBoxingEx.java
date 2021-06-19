import java.lang.*;
public class AutoBoxingEx
{
       public static void main(String [ ] args)
       {
              int num = 100;
              Integer i = num;
              Integer j = Integer.valueOf(num);
              System.out.println("num = " + num +" , i = " + i + " , j = " + j);
          }
} 
