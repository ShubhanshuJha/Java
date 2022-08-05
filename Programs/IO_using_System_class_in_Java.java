// System.in.read() reads the next byte of data from the input stream. The returned value of byte is in the range 0 to 255.

import static java.lang.System.*;
import java.io.IOException;

public class IO_using_System_class_in_Java {
	public static void main(String[] args) throws IOException {
		out.println("Space: " + ((int)' ') + "\tEnter: " + (int)'\n');
		intRead();
		charRead();
		stringRead();
	}
	static void intRead() throws IOException {
		int result = 0;
		out.print("Enter a value: ");
		int value = in.read();
		while (value == 10 || value == 13 || value == (int)' ')
			value = in.read();
		while (value != 13 && value != 32) {
			result = 10 * result + (value - 48);
			value = in.read();
		}
		// int value = in.read() - 48;
		out.println("You entered: " + result);
		// value = in.read();
	}
	static void charRead() throws IOException {
		out.print("Enter a value: ");
		char value = (char)in.read();
		while (value == 10 || value == 13 || value == (int)' ')
			value = (char)in.read();
		out.println("You entered: " + value);
	}
	static void stringRead() throws IOException {
		// ASCII value of 'Enter' is 13 and of 'Space' is -16
		StringBuffer str = new StringBuffer();
		out.print("Enter a value: ");
		int value = in.read();
		while (value == 10 || value == 13 || value == (int)' ')
			value = in.read();
		while (value != 13) {
			str.append((char)value);
			value = in.read();
		}
		if (str.charAt(0) == '\n')
			str.deleteCharAt(0);
		out.println("You entered: " + str);
	}
}