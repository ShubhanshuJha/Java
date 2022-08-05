/* ## Whenever a value of a primitive data type is passed, the values are copied from the actual parameters to the
formal parameters. This kind of parameter passing is known as pass by value. In pass by value, both the actual and
formal parameters point to different memory locations and the values are copied in both the memory locations.

## When an object is passed as a parameter, the formal and the actual parameters both refer to the same object and hence
the same memory location. Therefore, the changes made inside the method to the formal parameters are reflected in the
actual parameters also. This kind of parameter passing is known as pass by reference. */

import mypackages.io.*;
import java.io.*;

class ParameterPassingTechnique {
	int x = 10020, y = 12345;

	private static final Writer writer = new Writer(System.out);
	static final class Demo {
		public static void changeValue(int val1, int val2) {
			val1 ^= val2;
			val2 ^= val1;
			val1 ^= val2;
			writer.println("Inside the method, Value(X): " + val1 + " \tValue(Y): " + val2);
		}
		public static void changeValue(ParameterPassingTechnique test) {
			test.x ^= test.y;
			test.y ^= test.x;
			test.x ^= test.y;
			writer.println("Inside the method, Value(X): " + test.x + "\tValue(Y): " + test.y);
		}
	}
	
	public static void main(String[] args) throws IOException {
		int x = 20;
		int y = 10;
		writer.println("Before method call, Value(X): " + x + "\tValue(Y): " + y);
		Demo.changeValue(x, y);
		writer.println("After calling the changeValue function: ");
		writer.println("\tValue(X): " + x + " \tValue(Y): " + y);

		ParameterPassingTechnique test = new ParameterPassingTechnique();
		writer.println("\nBefore method call, Value(X): " + test.x + "\tValue(Y): " + test.y);
		Demo.changeValue(test.x, test.y);
		writer.println("After calling the changeValue function: ");
		writer.println("\tValue(X): " + test.x + "\tValue(Y): " + test.y);

		writer.println("\nBefore method call, Value(X): " + test.x + "\tValue(Y): " + test.y);
		Demo.changeValue(test);
		writer.println("After calling the changeValue function: ");
		writer.println("\tValue(X): " + test.x + "\tValue(Y): " + test.y);
	}
}