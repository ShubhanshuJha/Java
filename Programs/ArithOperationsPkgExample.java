import mypackages.util.ArithOperations;
import java.util.Scanner;

class ArithOperationsPkgExample extends ArithOperations{
	public static void main(String[] args) throws Exception {
		ArithOperations oper = new ArithOperations();
		Scanner input = new Scanner(System.in);
		int a = 5, b = 50;
		System.out.println(a + " + " + b + " = " + add(a, b));

		byte c = 5, d = 2;
		System.out.println(c + " + " + d + " = " + add(c, d));
		
		int e = 4, f = 6;
		System.out.println("LCM of " + e + " and " + f + " is: " + lcm(e, f));

		double e1 = 12, f1 = 6;
		System.out.println("LCM of " + e1 + " and " + f1 + " is: " + lcm(e1, f1));

		long e2 = 12, f2 = 6;
		System.out.println("GCD of " + e2 + " and " + f2 + " is: " + gcd(e2, f2));

		double g = 32.0;
		long h = 6;
		System.out.println(g + " is Power of 2 ? " + isPowerOfTwo(g));
		System.out.println(h + " is Power of 2 ? " + isPowerOfTwo(h));

		double g1 = 64;
		long h1 = 125;
		System.out.println("Square Root of " + g1 + " is: " + root(g1, 2));
		System.out.println("Cube Root of " + h1 + " is: " + root(h1, 3));

		long g2 = 55;
		System.out.println(g2 + " to the power 4 is: " + pow(g2, 4));
		System.out.println(4 + " Root of " + pow(g2, 4) + " is: " + root(pow(g2, 4), 4));
	}
}