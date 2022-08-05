import mypackages.io.*;

public class EuclideanGCD{
	// static int count1 = 0, count2 = 0;

	public static void main(String[] args) {
		Reader input = new Reader(System.in);
		Writer output = new Writer(System.out);

		output.print("Enter two numbers to find its GCD: ");
		int a = input.nextInt();
		int b = input.nextInt();

		output.println("GCD of " + a + " and " + b + " is: " + gcd2(a, b));

		// output.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
		// output.println("Method Call in method1-> " + count1);
		// output.println("Method Call in method2-> " + count2);
	}
	// This is more efficient does one less recursion as compared to method gcd().
	static int gcd2(int n, int m) {
		// count2++;
		if((n >= m) && ((n % m) == 0))
			return(m);
		return gcd2(m, (n % m));
	}
	// static int gcd(int a, int b) {
	// 	count1++;
	// 	if (b == 0)
	// 		return a;
	// 	return gcd(b, (a % b));
	// }
}