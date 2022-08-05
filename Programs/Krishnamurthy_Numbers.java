// Krishnamurthy Number
// A Krishnamurthy number is a number whose sum of the factorial of digits is equal to the number itself.
// Given a number N as input. Print "YES" if it's a Krishnamurthy Number, else Print "NO".
// Krishnamurthy Number is same as Strong Number.
// Input: 145		Output: Yes
// Input: 5314		Output: No
// Expected Time Complexity:  O(|N|)			Expected Auxiliary Space: O(1)


import mypackages.io.Writer;
import mypackages.io.Reader;

class Krishnamurthy_Numbers {
	static int[] factorial = new int[10];

	public static void main(String[] args) {
		Writer writer = new Writer(System.out);
		Reader reader = new Reader(System.in);
		try {
			writer.print("Enter a number: ");
			int n = reader.nextInt();
			writer.println("Is " + n + " a Strong Number? " + isKM_Number(n));
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	static String isKM_Number(int n) {
		fact();
		int copy_n = n;
		int factSum = 0;
		while (copy_n > 0) {
			factSum += factorial[copy_n % 10];
			copy_n /= 10;
		}
		return String.valueOf(factSum == n ? "Yes" : "No");
	}
	static void fact() {
		factorial[0] = 1;
		factorial[1] = 1;
		for (int i = 2; i < 9; i++) {
			factorial[i] = factorial[i - 1] * i;
		}
	}
}