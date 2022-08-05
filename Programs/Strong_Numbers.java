// Strong Numbers
// Strong Numbers are the numbers whose sum of factorial of digits is equal to the original number.
// Given a number, the task is to check if it is a Strong Number or not.
// Input: 145		Output: Yes
// Input: 5314		Output: No
// Expected Time Complexity: O(Number of digits in N)			Expected Auxiliary Space: O(1)


import mypackages.io.Writer;
import mypackages.io.Reader;

class Strong_Numbers {
	static int[] factorial = new int[10];

	public static void main(String[] args) {
		Writer writer = new Writer(System.out);
		Reader reader = new Reader(System.in);
		try {
			writer.print("Enter a number: ");
			int n = reader.nextInt();
			writer.println("Is " + n + " a Strong Number? " + isStrong(n));
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	static String isStrong(int n) {
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