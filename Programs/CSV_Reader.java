// Read a CSV File in Java
import java.io.*;

public class CSV_Reader{
	public static void main(String[] args) throws Exception{
		// String loc = br.readLine();
		String file_name = "D:\\Java Programming\\Java\\CSV_Files\\Series.csv";
		// File file = new File(file_name);
		// FileReader fr = new FileReader(file_name);
		Reader fr = new FileReader(file_name);
		DataOutputStream dos = new DataOutputStream(System.out);
		int i;
		while((i = fr.read()) != -1){
			dos.writeChars(String.valueOf((char)i));
		}
		fr.close();
		System.out.println("Successful");
		dos.close();
	}
}