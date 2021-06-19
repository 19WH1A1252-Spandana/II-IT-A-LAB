import java.io.*;
class Student implements Serializable
{
     public String studName;
     public String studBranch;
     public Student(String studName,String studBranch)
     {
          this.studName = studName;
          this.studBranch = studBranch;
      }
}

public class SerializationEx
{
     public static void main(String[ ] args)
     {
             Student stud = new Student("Spandana","IT");
              try
              {
                    FileOutputStream fos = new FileOutputStream("my_data.txt");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(stud);
                    oos.close();
                    fos.close();
                    System.out.println("The Object has been saved to my_data file!");
                }
                catch(Exception e)
                {
                     System.out.println(e);
                 }
        }
}




