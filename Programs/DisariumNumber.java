// Disarium Number
// Given a number N, find if it is Disarium or not. A number is called Disarium if sum of its digits powered with
// their respective positions is equal to the number itself.
// Input: N = 89		Output: Yes			Explanation: 8^1 + 9^2 = 89 thus output is 1.
// Input: N = 81		Output: No
// Expected Time Complexity: O(log(N))			Expected Auxiliary Space: O(1)


import mypackages.io.Writer;
import mypackages.io.Reader;

class DisariumNumber {
	public static void main(String[] args) {
		Writer writer = new Writer(System.out);
		Reader reader = new Reader(System.in);
		try {
			writer.print("Enter a number: ");
			int n = reader.nextInt();
			writer.println("Is " + n + " a Disarium Number? " + (isDisarium(n) == 1 ? "Yes" : "No"));
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	static int isDisarium(int N) {
        int count = getLen(N);
        int copy_n = N;
        int sum = 0;
        while (copy_n > 0) {
        	sum += Math.pow(copy_n % 10, count--);
        	copy_n /= 10;
        }
        return sum == N ? 1 : 0;
    }
    static int getLen(int n) {
    	int count = 0;
    	while (n > 0) {
    		count++;
    		n /= 10;
    	}
    	return count;
    }
}