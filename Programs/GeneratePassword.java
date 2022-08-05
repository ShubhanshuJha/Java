import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class GeneratePassword{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new 
		BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Username: ");
		String username = br.readLine();
		System.out.println("Want to type password or generate (Y/N)?");
		char choice = br.readLine().charAt(0);

		String pass1, pass2;
		if (choice == 'Y') {
			System.out.println("Enter password: ");
			pass1 = br.readLine();
			System.out.println("Enter password again to confirm: ");
			pass2 = br.readLine();
		}
		else{
			pass1 = pass2 = generatePass();
		}
		if (pass1.equals(pass2)) {
			System.out.println("Success");
			System.out.println("Username: "+username);
			System.out.println("Password: "+pass1);
		}
		else
			System.out.println("Password didn't match.");
	}

	static String generatePass(){
		Random r = new Random();
		byte[] password = new byte[12];
		r.nextBytes(password);

		// char[] password = new char[8];
		// // String password = "";
		// for (int i = 0; i < 8; i++) {
		// 	password[i] = Char.valueOf(r.nextInt(9));
		// 	// password += r.nextInt(9);
		// }
		byte[] password2 = new byte[2];
		r.nextBytes(password2);
		return password.toString()+password2.toString();
	}
}