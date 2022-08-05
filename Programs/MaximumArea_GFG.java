// Given the maximum possible area of the right angle triangle for a fixed length of hypotenuse.
// The task is to find the length of hypotenuse.
// Note: If the answer comes in Decimal, find it's Floor value.
// For Input: 25		Your Output: 10
// Expected Time Complexity: O(1)			Expected Auxiliary Space: O(1)


import mypackages.io.Writer;
import mypackages.io.Reader;

class MaximumArea_GFG {
	public static void main(String[] args) {
		Writer writer = new Writer(System.out);
		Reader reader = new Reader(System.in);
		try {
			writer.print("Enter the max. possible area of the right angle triangle: ");
			long N = reader.nextLong();
			writer.println("Hypotenuse of the triangle: " + getHypotenuse(N));
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	static int getHypotenuse(Long N) {
        return (int)Math.floor(Math.sqrt(N << 2));
    }
}