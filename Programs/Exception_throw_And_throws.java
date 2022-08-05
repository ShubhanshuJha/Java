// Use of throw keyword

import mypackages.io.*;

class Exception_throw_And_throws {

	private static final Writer writer = new Writer(System.out);

	public static void main(String[] args) {
		int a = 12, b = 2;
		writer.println("A = " + a + "\tB = " + b);
		int c;
		try {
			c = a / b;
			// writer.println("C = A/B => " + c);
			if (c < 5)
				throw new ConditionCheckException("Quotient is smaller than 5!");
			else
				writer.print("Greater or equal to 5");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			writer.println("\nBye-Bye");
		}
	}
}

class ConditionCheckException extends Exception {
	ConditionCheckException(String s) {
		super(s);
	}
}