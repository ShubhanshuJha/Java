import java.util.Scanner;
import java.math.BigInteger;

class Factorial {
	private BigInteger num;

	public Factorial(BigInteger num) {
		this.num = num;
	}

	void fact() {
		BigInteger fact = BigInteger.ONE;
		for (BigInteger i = BigInteger.ONE; i.compareTo(num) <= 0; i = i.add(BigInteger.ONE)) {
			fact = fact.multiply(i);
		}
		System.out.println("Factorial of " + num +"! is: " + fact);
	}
}

public class ShubhanshuJha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number: ");
		Factorial factorial = new Factorial(sc.nextBigInteger());
		factorial.fact();
	}
}