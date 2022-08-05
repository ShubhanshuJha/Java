/*  Implement a program that displays a message for a given number based on the below conditions.
	If the number is a multiple of 3, display "Zip".
    If the number is a multiple of 5, display "Zap".
    If the number is a multiple of both 3 and 5, display "Zoom".
    For all other cases, display "Invalid".

Sample Input and Output:
------------------------------------------------------------------------
Sample  Input 				|	Expected Output
------------------------------------------------------------------------
10 					 		|  Zap
------------------------------------------------------------------------
15		 					|  Zoom
------------------------------------------------------------------------
11							|  Invalid
------------------------------------------------------------------------ */

import mypackages.io.*;
import java.io.*;

class ZipZapZoom__SelectionControlStructure {

	private static final Writer writer = new Writer(System.out);
	private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		writer.print("Enter a number: ");
		int num = Integer.parseInt(reader.readLine());
		
		zip_zap_zoom(num);
	}
	
	private final static void zip_zap_zoom(int num) {
		if (num % 3 == 0 && num % 5 == 0) {
			writer.println("Zoom");
		} else if (num % 3 == 0) {
			writer.println("Zip");
		} else if (num % 5 == 0) {
			writer.println("Zap");
		} else {
			writer.println("Invalid");
		}
	}
}