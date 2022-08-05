import java.util.Scanner;

public class Factorial_FastUsingRecur{
	static int fnCount=0;
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = console.nextInt();
		int result = fact(n);
		System.out.println(result);
		System.out.println(fnCount);
	}
	public static int fact(int n){
		fnCount++;
		if (n == 1){
			return n;
		}
		return n * fact(n - 1);
	}
}