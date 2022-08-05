// The Lazy Caterer's Problem
// Given an integer n, denoting the number of cuts that can be made on a pancake,
// find the maximum number of piecesthat can be formed by making n cuts.
// NOTE: Cuts can't be horizontal.
// Example 1: Input: N = 1		Output: 2
// Example 2: Input: N = 2		Output: 4
// Example 3: Input: N = 3		Output: 7
// Explanation: 7 pieces can be formed by making 3 cuts.
// Example 4: Input: N = 4		Output: 11
// Example 5: Input: N = 5		Output: 16
// Explanation:  16 pieces can be formed by making 5 cuts.
// Expected Time Complexity: O(1)			Expected Auxiliary Space: O(1)


import mypackages.io.Writer;
import mypackages.io.Reader;

class TheLazyCaterer_s_Problem_GFG {
	public static void main(String[] args) {
		Writer writer = new Writer(System.out);
		Reader reader = new Reader(System.in);
		try {
			writer.print("Enter the number of cuts that can be made on a pancake: ");
			int n = reader.nextInt();
			writer.println("Max. number of pieces that can be formed by making " + n + 
							" cuts: " + maximum_Cuts(n));
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	public static int maximum_Cuts(int n) {
        return n * ++n / 2 + 1;
    }
}