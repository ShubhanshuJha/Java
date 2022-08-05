/*Define a class to represent a fractional number. Include member function to perform following task.
          a) To initialize numerator and denominator
          b) For additional of two fractional number
          c) For subtraction of two fractional number
          d) For multiplication of 2 fractional number
          e) For division of 2 fractional number.*/
import java.io.*;

public class OperateOnFractionalNumber{
	static Writer output = new Writer(System.out);

	public static void main(String[] args){
		Reader input = new Reader(System.in);
		
		output.println("\n\t\tChoose the operation you want to perform.");
		for (int i = 0; i < 30; i++) output.print("---");
		output.println("\n");

		String[] oper = {
			"\t1. Addition of two fractional numbers",
			"\t2. Subtraction of two fractional numbers",
			"\t3. Multiplication of 2 fractional numbers",
			"\t4. Division of 2 fractional numbers"
		};
		for (String s : oper) {
			output.println(s);
		}
		output.print("\t");

		try {
			int choice = input.nextInt();

			output.println("Enter values for the first fractional number:");
			output.print("\tEnter the numerator: ");
			int nume1 = input.nextInt();
			output.print("\tEnter the denominator: ");
			int deno1 = input.nextInt();

			output.println();

			output.println("Enter values for the second fractional number:");
			output.print("\tEnter the numerator: ");
			int nume2 = input.nextInt();
			output.print("\tEnter the denominator: ");
			int deno2 = input.nextInt();

			FractionNumber f1 = new FractionNumber(nume1, deno1);
			FractionNumber f2 = new FractionNumber(nume2, deno2);
			FractionNumber result;

			switch(choice) {
				case 1: 
					result = add(f1, f2);
					output.println("Addition Result: " + toString(result));
					break;
				case 2:
					result = sub(f1, f2);
					output.println("Subtraction Result: " + toString(result));
					break;
				case 3:
					result = mult(f1, f2);
					output.println("Multiplication Result: " + toString(result));
					break;
				case 4:
					result = div(f1, f2);
					output.println("Division Result: " + toString(result));
					break;
				default:
					output.println("Wrong Selection!!!");
			}
		} catch (java.util.InputMismatchException ime) {
			output.println(String.valueOf(ime));
		} catch (NumberFormatException nfe) {
			output.println(String.valueOf(nfe));
		} catch (ArithmeticException ae) {
			output.println("Result: " + 0);
		}
	}
	static String toString(FractionNumber fn) {
		int n = fn.nume, d = fn.deno;
		if (n == 1 && d == 1) return "1";
		return n + "/" + d;
	}
	static int gcd(int n, int m) {
		if((n >= m) && ((n % m) == 0))
			return(m);
		return gcd(m, (n % m));
	}

	static FractionNumber add(FractionNumber f1, FractionNumber f2) {
		int tempDeno = (f1.deno * f2.deno) / gcd(f1.deno, f2.deno);
		int tempNume = ((tempDeno / f1.deno) * f1.nume) + ((tempDeno / f2.deno) * f2.nume);
		int _gcd = gcd(tempNume, tempDeno);
		tempNume /= _gcd;
		tempDeno /= _gcd;
		return new FractionNumber(tempNume, tempDeno);
	}

	static FractionNumber sub(FractionNumber f1, FractionNumber f2) {
		int tempDeno = (f1.deno * f2.deno) / gcd(f1.deno, f2.deno);
		int tempNume = ((tempDeno / f1.deno) * f1.nume) - ((tempDeno / f2.deno) * f2.nume);
		int _gcd = gcd(tempNume, tempDeno);
		tempNume /= _gcd;
		tempDeno /= _gcd;
		return new FractionNumber(tempNume, tempDeno);
	}

	static FractionNumber mult(FractionNumber f1, FractionNumber f2) {
		int tempDeno = f1.deno * f2.deno;
		int tempNume = f1.nume * f2.nume;
		int _gcd = gcd(tempNume, tempDeno);
		tempNume /= _gcd;
		tempDeno /= _gcd;
		return new FractionNumber(tempNume, tempDeno);
	}

	static FractionNumber div(FractionNumber f1, FractionNumber f2) {
		return mult(f1, new FractionNumber(f2.deno, f2.nume));
	}
}
class FractionNumber {
	int nume, deno;
	FractionNumber(int nume, int deno) {
		this.nume = nume;
		this.deno = deno;
	}
}
class Writer {
	private BufferedWriter output;
	Writer(OutputStream stream) {
		output = new BufferedWriter(new OutputStreamWriter(stream));
	}
	void print(String s) {
		try{
			output.write(s); output.flush();
		} catch (IOException io) {}
	}
	void println(String s) {
		try{
			output.write(s + "\n"); output.flush();
		} catch (IOException io) {}
	}
	void print(int s) {
		try{
			output.write(s); output.flush();
		} catch (IOException io) {}
	}
	void println(int s) {
		try{
			output.write(s + "\n"); output.flush();
		} catch (IOException io) {}
	}
	void println() {
		try{
			output.write("\n"); output.flush();
		} catch (IOException io) {}
	}
}
class Reader {
	private BufferedReader input;
	Reader(InputStream stream) {
		input = new BufferedReader(new InputStreamReader(System.in));
	}
	int nextInt() {
		int val = 0;
		try {
			val = Integer.parseInt(input.readLine());
		} catch (IOException io) {}
		return val;
	}
	String nextLine() {
		String val = "";
		try {
			val = input.readLine();
		} catch (IOException io) {}
		return val;
	}
}