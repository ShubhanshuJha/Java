// Find roots of a quadratic equation
/*Quadratic equation is an equation with degree 2 in the form of ax2 +bx + c = 0 where a, b and c are the coefficients.
Implement a program to solve a quadratic equation.
Find the discriminant value using the formula given below.
discriminant = b^2 - 4ac
    If the discriminant is 0, the values of both the roots will be same. Display the value of the root.
    If the discriminant is greater than 0, the roots will be unequal real roots. Display the values of both the roots.
    If the discriminant is less than 0, there will be no real roots. Display the message "The equation has no real root".

Use the formula given below to find the roots of a quadratic equation.
x = (-b ± discriminant)/2a  */

import mypackages.io.*;

class RootsOfAQuadEqn {
	private static final Reader read = new Reader(System.in);
	private static final Writer write = new Writer(System.out);

	public static void main(String[] args) {
		write.println("Enter the coefficients:");
		write.print("\ta: ");
		int a = read.nextInt();
		write.print("\tb: ");
		int b = read.nextInt();
		write.print("\tc: ");
		int c = read.nextInt();

		int discriminant = (b * b) - 4 * a * c;
		if (discriminant == 0) {
			int root = (int)Math.sqrt(discriminant);
			root = (root - b) / (a << 1);
			write.print("Root of the equation is: " + root);
		} else if (discriminant > 0) {
			int root1 = (int)Math.sqrt(discriminant);
			int root2 = (root1 - b) / (a << 1);
			root1 = (-root1 - b) / (a << 1);
			write.print("Roots of the equation are: " + root1 + " and " + root2);
		} else {
			write.println("The equation has no real root.");
		}

	}
}