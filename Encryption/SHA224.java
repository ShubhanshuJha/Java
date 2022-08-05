import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.System.*;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA224 {
	public static void main(String[] args) throws IOException {
		try (BufferedReader input = new BufferedReader(new InputStreamReader(in))) {
			out.print("Enter a string: ");
			String inputString = input.readLine();
			out.println(inputString + ": " + toHexString(getSHA(inputString)));

			out.print("\nEnter a string: ");
			inputString = input.readLine();
			out.println(inputString + ": " + toHexString(getSHA(inputString)));
		} catch (NoSuchAlgorithmException nsae) {
			out.println("Exception thrown for incorrect algorithm: " + nsae);
		} catch (IOException ioe) {
			out.println("IOException thrown: " + ioe);
		}
	}

	private static byte[] getSHA(String str) throws NoSuchAlgorithmException {
		// Static getInstance method is called with hashing SHA
		MessageDigest md = MessageDigest.getInstance("SHA-224");

		// digest() method called to calc. message digest of input
		// and return array of byte
		return md.digest(str.getBytes(StandardCharsets.UTF_8));
	}
	private static String toHexString(byte[] hash) {
		// Convert byte array into signum representation
		BigInteger number = new BigInteger(1, hash);
		// Convert message digest into hex value
		StringBuilder hexString = new StringBuilder(number.toString(16));

		// Pad with leading zeros
        while (hexString.length() < 32) { 
            hexString.insert(0, '0');
        }
        return hexString.toString();
	}
}