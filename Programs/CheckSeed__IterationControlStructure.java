/*  Implement a program to find out whether a number is a seed of another number. A number X is said to be a seed of
	number Y if multiplying X by its every digit equates to Y. E.g.: 123 is a seed of 738 as 123*1*2*3 = 738
------------------------------------------------------------------------
Sample  Input 				|	Expected Output
------------------------------------------------------------------------
123, 738			 		|  123 is a seed of 738
------------------------------------------------------------------------
45, 1000					|  45 is not a seed of 1000
------------------------------------------------------------------------ */
import mypackages.io.*;
import java.io.*;

class CheckSeed__IterationControlStructure {

	private static final Writer writer = new Writer(System.out);
	private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		writer.print("Enter the first number: ");
		int num1 = Integer.parseInt(reader.readLine());
		writer.print("Enter the second number: ");
		int num2 = Integer.parseInt(reader.readLine());
		
		writer.println(num1 + " is " + (isSeedOfSecNum(num1, num2) ? "" : "not ") + 
						"a seed of " + num2);
	}
	
	private static boolean isSeedOfSecNum(int n1, int n2) {
		int revOfN1 = 0;
		long prod = n1;
		while (revOfN1 > 0) {
			revOfN1 = revOfN1 * 10 + n1 % 10;
			n1 /= 10;
		}
		while (revOfN1 > 0) {
			prod *= (revOfN1 % 10);
			revOfN1 /= 10;
		}
		return n2 % prod == 0;
	}
}