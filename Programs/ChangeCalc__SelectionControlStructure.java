/*  You have x number of $5 notes and y number of $1 notes. You want to purchase an item for amount z. The shopkeeper wants
	you to provide exact change. You want to pay using a minimum number of notes. How many $5 notes and $1 notes will you
	use? Implement a program to find out how many $5 notes and $1 notes will be used. If an exact change is not possible,
	then display -1.
Sample Input and Output:
------------------------------------------------------------------------
Sample  Input 				|	Expected Output
------------------------------------------------------------------------
$1 notes available = 2 		|  $1 notes needed = 1
$5 notes available = 2 		|  $5 notes needed = 4
Purchase amount = 21		|
------------------------------------------------------------------------
$1 notes available = 3 		|  -1
$5 notes available = 3 		|
Purchase amount = 19		|
------------------------------------------------------------------------  */

import mypackages.io.*;
import java.io.*;
import java.util.Arrays;

class ChangeCalc__SelectionControlStructure {

	private static final Writer writer = new Writer(System.out);
	private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		writer.print("$1 notes available: ");
		int oneDollarNotes = Integer.parseInt(reader.readLine());
		writer.print("$5 notes available: ");
		int fiveDollarNotes = Integer.parseInt(reader.readLine());
		writer.print("Purchase amount: ");
		int purchaseAmount = Integer.parseInt(reader.readLine());

		int[] result = getDenomination(oneDollarNotes, fiveDollarNotes, purchaseAmount);
		// writer.println(Arrays.toString(result));
		if (result[0] == -1) {
			writer.println(-1);
		} else {
			writer.println("$1 notes needed: " + result[0] +
							"\n$5 notes needed: " + result[1]);
		}
	}
	private final static int[] getDenomination(int one, int five, int purchase) {
		int moneyCurrHave = one + (five * 5);
		if (moneyCurrHave < purchase) return new int[]{-1};
		int[] reqDeno = {0, 0};
		reqDeno[1] = purchase / 5;
		reqDeno[0] = purchase % 5;
		return reqDeno;
	}
}