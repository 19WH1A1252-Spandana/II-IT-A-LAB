import java.io.*;
class PrintWriterDemo
{
    public static void main(String[] args) throws IOException
    {
       PrintWriter pw = new PrintWriter("textdoc.txt");
       pw.write("textdoc.txt is the file created.\n print writer is used to write text into this file.");
       pw.flush();
       pw.close();
    }
}