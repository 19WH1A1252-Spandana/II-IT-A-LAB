import java.io.*;
public class DeserializeEx
{
     public static void main(String[ ] args) throws Exception
     {
              try
              {
                      FileInputStream fis = new FileInputStream("my_data.txt");
                      ObjectInputStream ois = new ObjectInputStream(fis);
                      Student stud2 = (Student) ois.readObject();
                      System.out.println("The object has been deserialized.");
                      fis.close();
                      ois.close();
                      System.out.println("Name = " + stud2.studName);
                       System.out.println("Department =  "  +stud2.studBranch);
}
catch(Exception e)
{
System.out.println(e);
}
}
}