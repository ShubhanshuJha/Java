import java.util.*;
import java.io.*;
import java.nio.file.*;
public class ReadTxt{
	public static void main(String[] args) throws FileNotFoundException 
  { 
  	Scanner scan=new Scanner(System.in);
  	System.out.println("Enter the location of file: ");
  	String location=scan.nextLine();
    File file = new File("C:\\Users\\shubh\\Documents\\gui.txt");
    Scanner sc = new Scanner(file); 
    sc.useDelimiter("\\Z");
    System.out.println("\n");
    System.out.print(location);
    System.out.print(" Found the file... Reading ");
    System.out.print(location);
    System.out.println("\n");
    System.out.println(sc.next()); 
  } 
}