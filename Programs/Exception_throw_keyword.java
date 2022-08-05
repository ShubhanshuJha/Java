// Use of throw keyword

import mypackages.io.*;

class Exception_throw_keyword {

	private static final Writer writer = new Writer(System.out);
	private static final Reader reader = new Reader(System.in);

	public static void main(String[] args) {
		writer.print("Enter a number: ");
		int number = reader.nextInt();
		if (number < 5) {
			throw new ArithmeticException("Smaller than 5!");
		}
		writer.print("Greater or equal to 5");
	}
}