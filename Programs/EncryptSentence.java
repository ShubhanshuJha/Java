import java.io.*;
import java.util.*;

class EncryptSentence{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string to encrypt: ");
		String str_input = br.readLine();
		System.out.println("The encrypted sentence is:\n"+encrypt(str_input));
	}

	// Method that calls other required methods for encryption
	private static String encrypt(String str) throws StringIndexOutOfBoundsException{
		StringBuilder s = new StringBuilder();
		s.append(str.toUpperCase());
		// Reversing the sentence
		s = reverseString(s);
		// Performing the conversion
		s = toNumbers(s);
		// Adding '**' at the beginning and at the ending
		s = beginAndEnd(s);
		return s.toString();
	}

	// Method which returns the sentence in reversed order
	private static StringBuilder reverseString(StringBuilder s){
		return s.reverse();
	}

	// Method which is used to convert 'O' to zero, 'S' to $, and 'L' to 1
	private static StringBuilder toNumbers(StringBuilder s){
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'O') {
				s.setCharAt(i, '0');
			}
			if (s.charAt(i) == 'S') {
				s.setCharAt(i, '$');
			}
			if (s.charAt(i) == 'L') {
				s.setCharAt(i, '1');
			}
		}
		return s;
	}

	// Method to add '**' at the beginning and at the end
	private static StringBuilder beginAndEnd(StringBuilder s){
		s.insert(0,"**");
		s.insert(s.length(),"**");
		return s;
	}
}