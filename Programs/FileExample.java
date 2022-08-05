import java.io.*;
public class FileExample
{
public static void main(String args[]) throws IOException {
FileWriter fw=new FileWriter("file.txt",true);
BufferedWriter bf=new BufferedWriter(fw);
bf.write("HERO");
bf.close();
}
}