/*  Implement a program to check whether a given number is an Armstrong number. An Armstrong number is an n-digit number
	that is equal to the sum of the nth powers of its individual digits.
	E.g.: 371 is an Armstrong number as 3^3 + 7^3 + 1^3 = 371
	1634 is an Armstrong number as 1^4 + 6^4 + 3^4 + 4^4 = 1634

	Hint: Use Math.pow(double a, double b) method to calculate the power of a number.
------------------------------------------------------------------------
Sample  Input 				|	Expected Output
------------------------------------------------------------------------
371					 		|  371 is an Armstrong number
------------------------------------------------------------------------
1635						|  45 is not an Armstrong number
------------------------------------------------------------------------ */
import mypackages.io.*;
import java.io.*;

class CheckArmstrong__IterationControlStructure {

	private static final Writer writer = new Writer(System.out);
	private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		writer.print("Enter the number: ");
		int num = Integer.parseInt(reader.readLine());

		writer.println(num + " is " + (isArmstrong(num) ? "" : "not ") + 
						"an Armstrong number");
	}
	
	private static boolean isArmstrong(int num) {
		int lengthOfNum = (int)Math.floor(Math.log10(num) + 1);
		int powSum = 0;
		int tempN = num;
		while (tempN > 0) {
			powSum += (int) Math.pow(tempN % 10, lengthOfNum);
			tempN /= 10;
		}
		return num == powSum;
	}
}