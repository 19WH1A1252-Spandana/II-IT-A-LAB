import java.io.*;
class FileWriterDemo
{
   public static void main(String[] args) throws IOException
   {
       FileWriter fw = new FileWriter("Hello.txt");
       fw.write("hello.txt is the file created.\n File writer is used to write text into this file.");
       fw.flush();
       fw.close();
   }
}