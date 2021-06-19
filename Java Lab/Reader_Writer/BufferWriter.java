import java.io.*;
public class BufferWriter
{
   public static void main(String[] args) throws IOException
   {
       FileWriter fw = new FileWriter("abc.txt");
       BufferedWriter bw = new BufferedWriter(fw);
       bw.write("This is bufferwriter program writing into abc.txt file.");
       bw.newLine();
       bw.write(10);
       bw.flush();
       bw.close();
   }
}