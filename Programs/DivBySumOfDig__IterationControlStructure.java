/*  Implement a program to find out whether a number is divisible by the sum of its digits. Display appropriate messages.
------------------------------------------------------------------------
Sample  Input 				|	Expected Output
------------------------------------------------------------------------
2250				 		|  2250 is divisible by sum of its digits
------------------------------------------------------------------------
123							|  123 is not divisible by sum of its digits
------------------------------------------------------------------------ */
import mypackages.io.*;
import java.io.*;

class DivBySumOfDig__IterationControlStructure {

	private static final Writer writer = new Writer(System.out);
	private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		writer.print("Enter the number: ");
		int num = Integer.parseInt(reader.readLine());
		
		writer.println(num + " is " + (isDivBySumOfDigits(num) ? "" : "not ") + 
						"divisible by sum of its digits");
	}
	
	private static boolean isDivBySumOfDigits(int num) {
		if (num == 0 || num == 1) return true;
		int temp = num;
		int sumOfDig = 0;
		while (temp > 0) {
			sumOfDig += temp % 10;
			temp /= 10;
		}
		return num % sumOfDig == 0;
	}
}