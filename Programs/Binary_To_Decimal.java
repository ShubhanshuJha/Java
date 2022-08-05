import java.lang.*;
import java.io.*;

class Binary_To_Decimal{
	public static void main (String[] args) throws IOException{
		// InputStreamReader r = new InputStreamReader(System.in);
		// BufferedReader br = new BufferedReader(r);    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the binary number: ");
		String n = br.readLine();
		System.out.println(Integer.parseInt(n, 2));
		System.out.println("Press 1 perform Decimal to Binary conversion: ");
		int choice = Integer.parseInt(br.readLine());
		if (choice == 1){
			System.out.println("Enter the decimal number: ");
			int num = Integer.parseInt(br.readLine());
			System.out.println(Integer.toBinaryString(num));
		}
	}
}