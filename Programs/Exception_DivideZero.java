import java.io.*;
import static java.lang.System.*;

class Exception_DivideZero {
	static int anyFunction(int x, int y) throws Exception {
		if (y == 0)
			throw new UserException("You Can\'t Divide A Number By Zero.");
		return x / y;
		// int a = 0;
		// try {
		// 	a = x / y;
		// } catch (ArithmeticException e) {
		// 	// System.out.println("Division by zero");
		// 	throw new ArithmeticException("Divide By Zero");
		// }
		// return a;
	}

	public static void main(String args[]) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a = 0, b = 0, result = 0;
		out.print("Enter any two integers: ");
		try {
			a = Integer.parseInt(in.readLine());
			b = Integer.parseInt(in.readLine());
			result  = anyFunction(a, b);
			out.println("Result: " + result);
		} catch(IOException | NumberFormatException ignore){} catch(Exception ue) {
			// ue.printStackTrace();
			err.println(ue.getMessage());
		}

		// result  = anyFunction(a, b);
		// System.out.println("Result: " + result);
	}
}

class UserException extends Exception {
	public UserException(String s) {
		super(s);
	}
}