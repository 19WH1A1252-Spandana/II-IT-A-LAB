import java.io.*;
import java.util.*;
public class ThrowsException
{
    public static void validdatevote(int a) throws ArithmeticException
    {
        if(a<18)
        {
            throw new ArithmeticException("not eligible");
        }
        else
        {
            System.out.println("Eligible to vote");
        }
    }
    public static void main(String ars[])
    {
        System.out.println("Enter age");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        validdatevote(a);
        System.out.println("End");
    }
}