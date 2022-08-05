/* Implement a class Calculator with the method mentioned below.
	Methods: double findAverage(int num1, int num2, int num 3)
	Method Description:
	findAverage()
	    Calculate the average of three numbers
	    Return the average rounded off to two decimal digits
	Test the functionalities using the provided Tester class.
	Sample Input: 12, 8, 15
	Sample Output: 11.67 */

import mypackages.io.*;
import java.io.*;
import java.text.DecimalFormat;

class MethodImplementation_CalculateAverage {
	private static final Writer writer = new Writer(System.out);

	static final class Calculator {
		public static double findAverage(int num1, int num2, int num3) {
			return ((double) num1 + num2 + num3) / 3;
		}
	}
	
	public static void main(String[] args) throws IOException {
		DecimalFormat f = new DecimalFormat("##.00");

		int a = 12, b = 8, c = 15;
		writer.println("The three numbers are: " + a + ", " + b + ", " + c);
		double avg = Calculator.findAverage(a, b, c);
		writer.println("It\'s average is: " + f.format(avg));

		a = 10; b = 20; c = 30;
		writer.println("\nThe three numbers are: " + a + ", " + b + ", " + c);
		avg = Calculator.findAverage(a, b, c);
		writer.println("It\'s average is: " + f.format(avg));
	}
}

/* About Constructor:
A constructor in Java is a special method that is used to initialize class variables at the time of object creation.
Each time an object is created using the new() keyword, a constructor is called. A constructor can be created by the
programmer. If the developer does not create any constructor, then, Java provides a default constructor.
In the previous examples, we had not created any constructor, but Java provided a default constructor for every class.
Constructors have the same name as that of the class and does not have a return type.

A constructor with no arguments is known as a parameterless constructor. If you don’t define a constructor in a class,
then Java creates a default parameterless constructor and initializes the default values to the class variables based on
the data type. */