// Floyd's triangle Pattern
// Given a number N. The task is to print Floyd's triangle with N lines.
// Input: N = 4
//	Output:
//		1
//		2 3
//		4 5 6
//		7 8 9 10
// Expected Time Complexity: O(N^2)			Expected Auxiliary Space: O(1)


import mypackages.io.Writer;
import mypackages.io.Reader;

class FloydsTriangle_Pattern_GFG {
	public static void main(String[] args) {
		Writer writer = new Writer(System.out);
		Reader reader = new Reader(System.in);
		try {
			writer.print("Enter a number: ");
			int n = reader.nextInt();
			int value = 1;
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                writer.print(value++ + " ");
	            }
	            writer.println();
	        }
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}