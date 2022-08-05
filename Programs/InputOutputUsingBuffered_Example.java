import java.io.*;

public class InputOutputUsingBuffered_Example{
	public static void main(String[] args) throws IOException{
		// This isn't working as needed but doesn't give error.
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedOutputStream dr = new BufferedOutputStream(System.out);
		// dr.write(14);
		// dr.flush();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Hello there, this I/O is implemented using BufferedReader & BufferedWriter.");
		bw.flush();
		bw.write("\nEnter a string: ");
		bw.flush();
		String alpha = br.readLine();
		bw.write("\nYour input is: "+alpha);
		bw.flush();
	}
}