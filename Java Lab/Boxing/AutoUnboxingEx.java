import java.lang.*;
public class AutoUnboxingEx
{
      public static void main(String[ ] args)
     {
              Integer num = 200;
              int i = num;
              int j = num.intValue();
              System.out.println("num = " + num + ", i = " +  i + ", j =  " + j);
}
}  