/*  Implement a program to check whether a given number is a palindrome. Palindrome is a sequence that reads the same
	backwards as forwards. E.g.: 121, 1331, 2332, 78900987, 123456654321, etc.

Sample Input and Output:
------------------------------------------------------------------------
Sample  Input 				|	Expected Output
------------------------------------------------------------------------
1331				 		|  1331 is a palindrome
------------------------------------------------------------------------
46763	 					|  46763 is not a palindrome
------------------------------------------------------------------------ */

import mypackages.io.*;
import java.io.*;

class PalindromeCheck__IterationControlStructure {

	private static final Writer writer = new Writer(System.out);
	private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		writer.print("Enter a number: ");
		String num = reader.readLine();
		
		boolean isPalin = checkPalin(num);
		writer.println(num + " is " + (!isPalin ? "not " : "") + "a palindrome");
	}
	
	private final static boolean checkPalin(String num) {
		return num.equals(new StringBuffer(num).reverse().toString());
	}
}