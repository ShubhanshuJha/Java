// Write a CSV File in Java
import java.io.*;

public class CSV_Writer{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// String loc = br.readLine();
		String loc = "D:\\Java Programming\\Java\\CSV_Files\\Series.csv";
		PrintWriter out = new PrintWriter(new File(loc));
		StringBuilder sb = new StringBuilder();

		sb.append("Sl. No.");
		sb.append(",");
		sb.append("Series");
		sb.append(",");
		sb.append("Sum");
		sb.append("\r\n");
		String temp = "";
		int sum = 0;
		for (int i=1; i<=10; i++) {
			sb.append(i);
			sb.append(",");
			temp = temp + i + "+";
			String currStr = temp.substring(0, temp.length()-1);
			sb.append(currStr);
			sb.append(",");
			sum += i;
			sb.append(sum);
			sb.append("\r\n");
		}
		out.write(sb.toString());
		out.close();
		System.out.println("Successful");
	}
}